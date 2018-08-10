const Film = require('../models').Film;

module.exports = {
	index: (req, res) => {
        let films = Film.findAll().then(films => {
            res.render('film/index', {'films': films})
        });
	},

	createGet: (req, res) => {
        res.render("film/create");
	},

	createPost: (req, res) => {
        let args = req.body;

        Film.create(args).then(() =>{
            res.redirect("/");
        })
	},

	editGet: (req, res) => {
        let id = req.params.id;

        Film.findById(id).then(film => {
            res.render("film/edit", {"film":film.name,
                "id": id,
                "name": film.name,
                "genre": film.genre,
                "director": film.director,
                "year": film.year,
			})
        })
	},

	editPost: (req, res) => {
        let id = req.params.id;
        let args = req.body;

        Film.findById(id).then(film => {
            film.updateAttributes(args).then(() => {
                res.redirect('/');
            });
        })
	},

	deleteGet: (req, res) => {
        let id = req.params.id;

        Film.findById(id).then(film => {
            res.render("film/delete", {"film":film.name,
                "id": id,
                "name": film.name,
                "genre": film.genre,
                "director": film.director,
                "year": film.year,
            });
        })
	},

	deletePost: (req, res) => {
        let id = req.params.id;

        Film.findById(id).then(film => {
            film.destroy().then(() => {
                res.redirect('/');
            })
        });
	}
};