using BookLibrary.Data;
using BookLibrary.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using System.Security.Claims;
using System.Linq;
using Microsoft.EntityFrameworkCore;

namespace BookLibrary.Controllers
{
    public class BookController : Controller
    {
        private readonly ApplicationDbContext context;
        private readonly IHttpContextAccessor httpContext;

        public BookController(ApplicationDbContext context, IHttpContextAccessor httpContextAccessor)
        {
            this.context = context;
            this.httpContext = httpContextAccessor;
        }

        [HttpGet]
        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("/book/create")]
        public IActionResult CreateProcess(Book book)
        {
            book.UserId = httpContext.HttpContext.User.FindFirst(ClaimTypes.NameIdentifier).Value;
            this.context.Book.Add(book);
            this.context.SaveChanges();

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            Book book = this.context.Book.Find(id);

            return View(book);
        }

        [HttpPost]
        [Route("/book/edit/{id}")]
        public IActionResult EditProcess(Book bookToEdit)
        {
            Book book = this.context.Book.Find(bookToEdit.Id);
            book.Title = bookToEdit.Title;
            book.Description = bookToEdit.Description;

            this.context.Book.Update(book);
            this.context.SaveChanges();

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public IActionResult Details(int id)
        {
            Book book = this.context
                .Book
                .Include(b => b.User)
                .FirstOrDefault(b => b.Id == id);

            return View(book);
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            Book book = this.context
                .Book
                .Include(b => b.User)
                .FirstOrDefault(b=>b.Id == id);

            return View(book);
        }

        [HttpPost]
        [Route("/book/delete/{id}")]
        public IActionResult DeleteProcess(Book book)
        {
            this.context.Book.Remove(book);
            this.context.SaveChanges();

            return RedirectToAction("Index", "Home");
        }
    }
}