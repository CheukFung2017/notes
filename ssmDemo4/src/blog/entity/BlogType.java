package blog.entity;

/**
 * @author Administrator
 * ���·���ʵ����
 */
public class BlogType {
	/**
	 * ���·���id
	 */
	private Integer id;
	/**
	 * ���·�������
	 */
	private String typename;
	/**
	 * ������µ�������
	 */
	private String typecount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getTypecount() {
		return typecount;
	}
	public void setTypecount(String typecount) {
		this.typecount = typecount;
	}
	
	@Override
	public String toString() {
		return "BlogType [id=" + id + ", typename=" + typename + ", typecount=" + typecount + "]";
	}
	
}
