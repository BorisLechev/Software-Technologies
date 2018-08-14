namespace IssueTracker.Models
{
    using System.ComponentModel.DataAnnotations;

    public class Issue
    {
        public int Id { get; set; }

        public string Title { get; set; }

        public string Content { get; set; }

        public string Priority { get; set; }
    }
}
