using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using ASP.NETLab.Data;
using ASP.NETLab.Models;
using System.Collections.Generic;
using System;

namespace ASP.NETLab.Controllers
{
    public class SongController : Controller
    {
        private readonly SongDbContext context;

        public SongController(SongDbContext context)
        {
            this.context = context;
        }

        [HttpGet]
        public IActionResult Index()
        {
            List<Song> songs = context.Songs.ToList();

            return View(songs);
        }

        [HttpGet]
        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("song/create")]
        public IActionResult CreateConfirm(Song song)
        {
            this.context.Songs.Add(song);
            this.context.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Details(int id)
        {
            Song song = this.context
                .Songs
                .Find(id);

            if (song == null)
            {
                return RedirectToAction("Index");
            }

            return View(song);
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            Song song = this.context
                .Songs
                .Find(id);

            return View(song);
        }

        [HttpPost]
        [Route("/song/edit/{id}")]
        public IActionResult SaveEdit(Song song)
        {
            this.context.Songs.Update(song);
            this.context.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            Song song = this.context
                .Songs
                .Find(id);

            if (song == null)
            {
                return RedirectToAction("Index");
            }

            return View(song);
        }

        [HttpPost]
        [Route("/song/delete/{id}")]
        public IActionResult SaveDelete(Song song)
        {
            this.context.Songs.Remove(song);
            this.context.SaveChanges();

            return RedirectToAction("Index");
        }
    }
}
