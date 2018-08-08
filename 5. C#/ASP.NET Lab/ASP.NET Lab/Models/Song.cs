using ASP.NETLab.Models;
using System.ComponentModel.DataAnnotations;

namespace ASP.NETLab.Models
{
    public class Song
    {
        [Key]
        public int Id { get; set; }

        [Required]
        [MaxLength(25)]
        public string Name { get; set; }

        [Required]
        public string Genre { get; set; }

        [Required]
        public string Singer { get; set; }
    }
}
