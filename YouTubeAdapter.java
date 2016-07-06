public class YouTubeAdapter implements SocialMediaEntry {
   private YouTubeVideo _video;
   
   public YouTubeAdapter(YouTubeVideo video) {
      _video = video;
   }

   public String getUser() {
      return _video.getAuthor();
   }
   
   public String getPostText(){
      return _video.getDescription();
   }
}