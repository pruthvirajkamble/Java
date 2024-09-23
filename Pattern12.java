import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
class Pattern12
{
	public static void main(String[] args) {
		try{
			File file = new File("E:\\M17\\Programs\\Java\\Dog (1).jpg");
			BufferedImage image = ImageIO.read(file);
			for(int i=0;i<image.getHeight();i++)
			{
				for (int j=0;j<image.getWidth() ;j++ ) {
					Color cl = new Color(image.getRGB(j,i));
					if(cl.getRed()==0&&cl.getGreen()==0&&cl.getBlue()==0)
						System.out.print(" ");
					else 
						System.out.print("@");
					
				}
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("SOMETHING WENT WRONG");
		}
	}
}