package ikinciGunOdevleri;

public class Course {
	private int id;
	private String name;
	private int progress;
	private String content;
	
	public void Course(){
		
	}
	
	public Course(int id, String name, int progress, String content) {
		super();
		this.id = id;
		this.name = name;
		this.progress = progress;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
