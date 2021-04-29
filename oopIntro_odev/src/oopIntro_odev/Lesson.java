package oopIntro_odev;

public class Lesson implements Entity{
	
	private int lessonId;
	private String descriptions;
	private String youtubeLink;
	
	public int getLessonId() {
		return lessonId;
	}

	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getYoutubeLink() {
		return youtubeLink;
	}

	public void setYoutubeLink(String youtubeLink) {
		this.youtubeLink = youtubeLink;
	}

	public Lesson() {
		
	}
	
	public Lesson(int lessonId,String descriptions,String youtubeLink) {
		this.lessonId=lessonId;
		this.descriptions=descriptions;
		this.youtubeLink=youtubeLink;
	}
}
