using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using CSharpBlog.Models;

namespace CSharpBlog.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        
    }
}
