package com.tan.bean;

public class Intent {
	private String id;
	private String nickname;
	private String title;
	private String content;
	private String createtime;
	
	
	public Intent(String id,String nickname,String title,String content,String createtime){
		this.id = id;
		this.nickname = nickname;
		this.title = title;
		this.content = content;
		this.createtime = createtime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

}
