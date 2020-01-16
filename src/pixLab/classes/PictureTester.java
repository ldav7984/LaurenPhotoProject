package pixLab.classes;

import java.awt.Color;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test zeroRed */
  public static void testZeroRed()
  {
	 Picture beach = new Picture("beach.jpg");
	 beach.explore();
	 beach.zeroRed();
	 beach.explore();
  }
  
  public static void testZeroGreen()
  {
	  Picture beach =  new Picture("beach.jpg");
	  beach.explore();
	  beach.zeroGreen();
	  beach.explore();
  }
  
  public static void testHalveBlue()
  {
	  Picture beach =  new Picture("beach.jpg");
	  beach.explore();
	  beach.halveBlue();
	  beach.explore();
  }
  
  public static void testHalveRed()
  {
	  Picture beach =  new Picture("beach.jpg");
	  beach.explore();
	  beach.halveRed();
	  beach.explore();
  }
  
  public static void testHalveGreen()
  {
	  Picture beach =  new Picture("beach.jpg");
	  beach.explore();
	  beach.halveGreen();
	  beach.explore();
  }
  
  public static void testHalveColors()
  {
	  Picture beach =  new Picture("beach.jpg");
	  beach.explore();
	  beach.halveColors();
	  beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();
  }
  
  /** Method to test keepOnlyGreen */
  public static void testKeepOnlyGreen()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();
  }
  
  /** Method to test keepOnlyGreen */
  public static void testSwitchRedBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.switchRedBlue();
	  beach.explore();
  }
  
  /** Method to test keepOnlyGreen */
  public static void testSwitchRedGreen()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.switchRedGreen();
	  beach.explore();
  }
  
  /** Method to test keepOnlyGreen */
  public static void testSwitchBlueGreen()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.switchBlueGreen();
	  beach.explore();
  }
  /** Method to test negate */
  public static void testNegate()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testReflectAndRecolor()
  {
	  Picture kyogre = new Picture("Kyogre.jpg");
	  kyogre.explore();
	  kyogre.reflectAndRecolor();
	  kyogre.explore();
  }
  
  public static void testStripe()
  {
	  Picture picture = new Picture("Kyogre.jpg");
	  picture.explore();
	  
	  picture.stripe(-200, 50, 50, 100, 100);
	  picture.explore();
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("Kyogre.jpg");
	  
	  Picture message = new Picture("KyogreHide.jpg");
	  source.explore();
	  //message.explore();
	  source.hidePicture(message);
	  source.explore();
	  source.revealPicture();
	  source.explore();
  }
  
  public static void testGlitchify()
  {
	  Picture glitched = new Picture("PokemonORAS.jpg");
	  
	  glitched.explore();
	  glitched.glitchify(glitched);
	  glitched.explore();
	  
  }
  
  
  public static void testShift()
  {
	  Picture kyogre = new Picture("Kyogre.jpg");
	  kyogre.explore();
	  kyogre.shiftLeftRight(kyogre.getWidth() / 2);
	  kyogre.shiftUpDown(kyogre.getHeight() / 2);
	  kyogre.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
    
  }
  
  public static void testRandomize()
  {
	  Picture swan = new Picture("swan.jpg");
	  int endRow = swan.getWidth();
	  int endCol = swan.getHeight();
	  swan.randomize(0, 0, 50, 50);
	  swan.explore();
  }
  
  public static void testChromakey()
  {
	  Picture source = new Picture("Rayquaza.jpg");
	  Picture background = new Picture("OuterSpace.jpg");
	  source.explore();
	  background.explore();
	  source.chromakey(background, Color.WHITE);
	  source.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  
    //testZeroBlue(); //done
	//testZeroRed(); //done
	//testZeroGreen(); //done
	   
	//testHalveBlue(); //done
	//testHalveRed(); //done
	//testHalveGreen(); //done
	//testHalveColors(); //done
	  
    //testKeepOnlyBlue(); //done
    //testKeepOnlyRed(); //done
    //testKeepOnlyGreen(); //done
	  
	//testSwitchRedBlue(); //done
	//testSwitchRedGreen(); //done
	//testSwitchBlueGreen(); //done
	  
    //testNegate(); //done
    //testGrayscale(); //done
    //testFixUnderwater();
    
    //testMirrorVertical(); //done
    //testMirrorTemple(); //done
    //testMirrorArms();
    //testMirrorGull();
	  
	//testReflectAndRecolor(); //done
	//testStripe(); //done
	  
	
    testGlitchify(); 
    
    
    //testRandomize(); //done
	  
	//testSteganography();
	  
	//testShift(); //done
    //testMirrorDiagonal();
    
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    
    //testChromakey(); //done
    
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}