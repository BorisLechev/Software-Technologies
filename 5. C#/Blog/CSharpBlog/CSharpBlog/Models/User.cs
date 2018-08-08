using Microsoft.AspNetCore.Identity;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace CSharpBlog.Models
{
    public class User : IdentityUser
    {
        [Required]
        [MinLength(5), MaxLength(100)]
        public string FullName { get; set; }

        public List<Article> Articles { get; set; }
    }
}
