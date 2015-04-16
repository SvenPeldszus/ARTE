package arte.shell;

import static org.fusesource.jansi.Ansi.ansi;

import org.fusesource.jansi.AnsiRenderer;

public class Colors {

	//End color code
	
	public final static String end = AnsiRenderer.END_TOKEN.toString();

	
	//Begin color codes
	
	public final static String begin_blue = AnsiRenderer.BEGIN_TOKEN.toString().concat(AnsiRenderer.Code.BLUE.toString()).concat(AnsiRenderer.CODE_TEXT_SEPARATOR);
	public final static String begin_cyan = AnsiRenderer.BEGIN_TOKEN.toString().concat(AnsiRenderer.Code.CYAN.toString()).concat(AnsiRenderer.CODE_TEXT_SEPARATOR);
	public final static String begin_green = AnsiRenderer.BEGIN_TOKEN.toString().concat(AnsiRenderer.Code.GREEN.toString()).concat(AnsiRenderer.CODE_TEXT_SEPARATOR);
	public final static String begin_magenta = AnsiRenderer.BEGIN_TOKEN.toString().concat(AnsiRenderer.Code.MAGENTA.toString()).concat(AnsiRenderer.CODE_TEXT_SEPARATOR);
	public final static String begin_red = AnsiRenderer.BEGIN_TOKEN.toString().concat(AnsiRenderer.Code.RED.toString()).concat(AnsiRenderer.CODE_TEXT_SEPARATOR);
	public final static String begin_yellow = AnsiRenderer.BEGIN_TOKEN.toString().concat(AnsiRenderer.Code.YELLOW.toString()).concat(AnsiRenderer.CODE_TEXT_SEPARATOR);
	public final static String begin_black = AnsiRenderer.BEGIN_TOKEN.toString().concat(AnsiRenderer.Code.WHITE.toString()).concat(AnsiRenderer.CODE_TEXT_SEPARATOR);

	
	//Print with new line command
	
	public static void println_yellow(String ansi){
		System.out.println(ansi().render(begin_yellow+ansi+end));
	}
	
	public static void println_green(String ansi){
		System.out.println(ansi().render(begin_green+ansi+end));
	}
	
	public static void println_red(String ansi){
		System.out.println(ansi().render(begin_red+ansi+end));
	}
	
	public static void println_magenta(String ansi){
		System.out.println(ansi().render(begin_magenta+ansi+end));
	}
	
	
	//Print without starting new line
	
	public static void print_yellow(String ansi){
		System.out.print(ansi().render(begin_yellow+ansi+end));
	}
	
	public static void print_green(String ansi){
		System.out.print(ansi().render(begin_green+ansi+end));
	}
	
	public static void print_red(String ansi){
		System.out.print(ansi().render(begin_red+ansi+end));
	}
	
	public static void print_magenta(String ansi){
		System.out.print(ansi().render(begin_magenta+ansi+end));
	}
}
