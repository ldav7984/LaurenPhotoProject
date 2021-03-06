package pixLab.classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 uisng a for-each loop*/
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set the red to 0 using a for loop*/
  public void zeroRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
		  
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			 pixels[row][col].setRed(0);
		  }
	  }
  }
  
  /** Method to set the green to 0 using a for loop*/
  public void zeroGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 0; row < pixels.length; row ++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  Pixel tempPixel = pixels[row][col];
			  tempPixel.setGreen(0);
		  }
	  }
  }
  
  public void halveBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setBlue(pixelObj.getBlue() / 2);
		  }
	  }
  }
  
  public void halveRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(pixelObj.getRed() / 2);
		  }
	  }
  }
  
  public void halveGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setGreen(pixelObj.getGreen() / 2);
		  }
	  }
  }
  
  public void halveColors()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setBlue(pixelObj.getBlue() / 2);
			  pixelObj.setRed(pixelObj.getRed() / 2);
			  pixelObj.setGreen(pixelObj.getGreen() / 2);
		  }
	  }
  }
  
  /** Method to set red and green to 0 */
  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  /** Method to set blue and green to 0 */
  public void keepOnlyRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setBlue(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  /** Method to set blue and red to 0 */
  public void keepOnlyGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setBlue(0);
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void switchRedBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray) 
		  {
			  int red = pixelObj.getRed();
			  int blue = pixelObj.getBlue();
			  pixelObj.setRed(blue);
			  pixelObj.setBlue(red);
		  }
	  }
  }
  
  public void switchRedGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray) 
		  {
			  int red = pixelObj.getRed();
			  int green = pixelObj.getGreen();
			  pixelObj.setRed(green);
			  pixelObj.setGreen(red);
		  }
	  }
  }
  
  public void switchBlueGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray) 
		  {
			  int blue = pixelObj.getBlue();
			  int green = pixelObj.getGreen();
			  pixelObj.setBlue(green);
			  pixelObj.setGreen(blue);
		  }
	  }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setBlue(255 - pixelObj.getBlue());
		  }
	  }
  }
  
  public void grayscale()
  {
	Pixel[][] pixels = this.getPixels2D();
	for (Pixel[] rowArray : pixels)
	{
		for (Pixel pixelObj : rowArray)
		{
			int average = pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue();
			average = average / 3;
			pixelObj.setRed(average);
			pixelObj.setGreen(average);
			pixelObj.setBlue(average);
		}
	}
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor()); //to mirror left side onto right
        //leftPixel.setColor(rightPixel.getColor()); //to mirror right side onto left
        
      }
    } 
  }
  
  public void reflectAndRecolor()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel firstPixel = null;
	  Pixel newPixel = null;
	  
	  int height = pixels.length;
	  int width = pixels[0].length;
	  
	  for (int row = 30; row < height - 30; row++)
	  {
		  for (int col = 30; col < width - 30; col++)
		  {
			  firstPixel = pixels[row][col];
			  
			  //pixels[row][col].setGreen(0);
			
			  newPixel = pixels[row][width - 1 - col];
			  newPixel.setColor(firstPixel.getColor());
			  newPixel.setGreen(255 - newPixel.getGreen());
			  
			  newPixel = pixels[height - 1 - row][col];
			  newPixel.setColor(firstPixel.getColor());
			  newPixel.setBlue(255 - newPixel.getBlue());
			  
			  //firstPixel.setRed(255 - firstPixel.getRed());
		  }
	  }
	  
  }
 
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 347;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int count = 0;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  //loop through the rows
	  for (int row = 232; row < 323; row ++)
	  {
		  //loop from 237 to just before the mirror point
		  for (int col = 237; col < mirrorPoint; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
	  int startRow = 232;
	  int endRow = 324;
	  int startCol = 235;
	  int endCol = 245;
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    //this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void glitchify(Picture picture)
  {
	  picture.shiftLeftRight(picture.getWidth() / 2);
	  picture.shiftUpDown(picture.getHeight() / 2);
	  picture.negate();
	  picture.randomize(0, 0, picture.getWidth(), picture.getHeight());
	  //picture.halveRed();
	  picture.switchRedBlue();
	  //picture.switchRedGreen();
	  //picture.switchBlueGreen();
  }
  
  
//picture.mirrorVertical();
  //picture.stripe(200, 50, 50, 100, 100);
  
  
  public Color randomColor()
  {
	  Color random;
	  int red = (int) (Math.random() * 256);
	  int green = (int) (Math.random() * 256);
	  int blue = (int) (Math.random() * 256);
	  
	  random = new Color(red, green, blue);
	  return random;
  }
  
  public void randomize(int startRow, int startCol, int endRow, int endCol)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  int randomNumber = (int) (Math.random() * 600);
			  if (randomNumber % 17 == 0)
			  {
				  pixels[row][col].setColor(randomColor());
			  }
		  }
	  }
	  //int randomNumber = (int) (Math.random() * picture.getWidth())
  }
  
  
  public void stripe(int amount, int startRow, int endRow, int startCol, int endCol)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Picture temp = new Picture(this);
	  Pixel [][] copied = temp.getPixels2D();
	  
	  int shiftedValue = amount;
	  int width = pixels[0].length;
	  int height = pixels.length;
	  
	  //left/right
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  shiftedValue = (col + amount) % width;
			  if (amount < 0)
			  {
				  shiftedValue = ((row + amount) % width + width) % width;
			  }
			  copied[row][col].setColor(pixels[row][shiftedValue].getColor());
		  }
	  }
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  pixels[row][col].setColor(copied[row][col].getColor());
		  }
	  }
	  
	  //up/down
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  shiftedValue = (row + amount) % height;
			  if (amount < 0)
			  {
				  shiftedValue = ((col + amount) % height + height) % height; 
			  }
			  copied[row][col].setColor(pixels[shiftedValue][col].getColor());
		  }
	  }
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  pixels[row][col].setColor(copied[row][col].getColor());
		  }
	  }
	  //row = start row, row less than end row 
  }
  
  public void chromakey(Picture replacement, Color changeColor)
  {
	  Pixel [][] mainPixels = this.getPixels2D();
	  Pixel [][] replacementPixels = replacement.getPixels2D();
	  
	  for (int row = 0; row < mainPixels.length; row++)
	  {
		  for (int col = 0; col < mainPixels[0].length; col++) 
		  {
			  if (mainPixels[row][col].colorDistance(changeColor) < 10)
			  {
				 mainPixels[row][col].setColor(replacementPixels[row][col].getColor()); 
			  }
		  }
	  }
  }
  
  public void shiftLeftRight(int amount)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Picture temp = new Picture(this);
	  Pixel [][] copied = temp.getPixels2D();
	  
	  int shiftedValue = amount;
	  int width = pixels[0].length;
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  shiftedValue = (col + amount) % width;
			  if (amount < 0)
			  {
				  shiftedValue = ((col + amount) % width + width) % width;
			  }
			  copied[row][col].setColor(pixels[row][shiftedValue].getColor());
			  
		  }
	  }
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  pixels[row][col].setColor(copied[row][col].getColor());
		  }
	  }
  }
  
  public void shiftUpDown(int amount)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Picture temp = new Picture(this);
	  Pixel [][] copied = temp.getPixels2D();
	  
	  int shiftedValue = amount;
	 
	  int height = pixels.length;
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  shiftedValue = (row + amount) % height;
			  if (amount < 0)
			  {
				  shiftedValue = ((row + amount) % height + height) % height;
			  }
			  copied[row][col].setColor(pixels[shiftedValue][col].getColor());
		  }
	  }
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  pixels[row][col].setColor(copied[row][col].getColor());
		  }
	  }
  }
  
  public void hidePicture(Picture hidden)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel[][] hiddenPixels = hidden.getPixels2D();
	  
	  for (int row = 0; row < pixels.length && row < hiddenPixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length && col < hiddenPixels[0].length; col++)
		  {
			  //There is a message to hide
			  if (hiddenPixels[row][col].colorDistance(Color.WHITE) > 5)
			  {
				  if (pixels[row][col].getRed() > 0 && pixels[row][col].getRed() % 2 != 1)
				  {
					  pixels[row][col].setRed(pixels[row][col].getRed() - 1);
				  }
			  }
			  else if (pixels[row][col].getRed() > 0 && pixels[row][col].getRed() % 2 == 1)
			  {
				  pixels[row][col].setRed(pixels[row][col].getRed() -1);
			  }
		  }
	  }
  }
  
  public void revealPicture()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for(int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  //There is a message to reveal
			  if (pixels[row][col].getRed() % 2 != 1)
			  {
				  pixels[row][col].setColor(Color.GREEN);
			  }
			  else if (pixels[row][col].getRed() % 2 == 1)
			  {
				  pixels[row][col].setColor(Color.PINK);
			  }
		  }
	  }
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture kyogre = new Picture("Kyogre.jpg");
    //kyogre.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
