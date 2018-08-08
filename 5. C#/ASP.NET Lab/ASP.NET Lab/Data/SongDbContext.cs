using ASP.NETLab.Models;
using Microsoft.EntityFrameworkCore;

namespace ASP.NETLab.Data
{
    public class SongDbContext : DbContext
    {
        public SongDbContext()
        {
            this.Database.EnsureCreated();
        }

        public DbSet<Song> Songs { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("server=localhost;database=songs;user=root;SslMode=none");
        }
    }
}
