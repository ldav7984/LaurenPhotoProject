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
  
  public static void testGlitchify()
  {
	  Picture kyogre = new Picture("Kyogre.jpg");
	  kyogre.explore();
	  kyogre.glitchify(-200, 50, 50, 100, 100);
	  kyogre.explore();
  }
  
  
  public static void testShift()
  {
	  Picture kyogre = new Picture("Kyogre.jpg");
	  kyogre.explore();
	  kyogre.shiftLeftRight(-200);
	  kyogre.shiftUpDown(-200);
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
	  swan.randomize(0, 0, 500, 50);
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
    //testKeepOnlyBlue(); //done
    //testKeepOnlyRed(); //done
    //testKeepOnlyGreen(); //done
    //testNegate(); //done
    //testGrayscale(); //done
    //testFixUnderwater();
    
    //testMirrorVertical(); //done
    //testMirrorTemple(); //done
    //testMirrorArms();
    //testMirrorGull();
	  
	//testReflectAndRecolor(); //done
    testGlitchify(); 
    //testRandomize(); 
	  
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