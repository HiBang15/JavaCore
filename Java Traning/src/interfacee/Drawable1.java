package interfacee;

public interface Drawable1{
	public void Draw(int color);
	public static int rgb(int r, int g, int b) {
		return r << 16 | g<<8 | b;
	}
}
