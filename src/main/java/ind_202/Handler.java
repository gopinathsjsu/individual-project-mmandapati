package ind_202;

public interface Handler {
	public void setHandler(Handler nexthandler);
	public void check(String filepath);

}
