package shapes;

import java.util.Arrays;

import static org.junit.Assert.*;


/**
 * Created by root on 22.06.17.
 */
public class myTests {
    @org.junit.Test
    public void testRectangle() throws Exception {
        Shape e = Shapes.makeRectangle(new V2(0, 0), new V2(1, 2));
        V2 p1 = new V2(0.5, -1);
        V2 p2 = new V2(1,1);
        assertTrue(e.contains(p1));
        assertFalse(e.contains(p2));

        assertFalse(e.move(new V2(-2, 0)).contains(p1));
    }

    @org.junit.Test
    public void testEllipseQuadrantOne() throws Exception {
        Shape e = Shapes.makeEllipse(new V2(0, 0), new V2(1, 2));
        V2 p1 = new V2(0.5, 1);
        V2 p2 = new V2(1,1);
        assertTrue(e.contains(p1));
        assertFalse(e.contains(p2));

        assertFalse(e.move(new V2(-2, 0)).contains(p1));
    }

    @org.junit.Test
    public void testEllipseQuadrantTwo() throws Exception {
        Shape e = Shapes.makeEllipse(new V2(0, 0), new V2(1, 2));
        V2 p1 = new V2(-0.5, 1);
        V2 p2 = new V2(-1,1);
        assertTrue(e.contains(p1));
        assertFalse(e.contains(p2));

        assertFalse(e.move(new V2(2, 0)).contains(p1));
    }


    @org.junit.Test
    public void testEllipseQuadrantThree() throws Exception {
        Shape e = Shapes.makeEllipse(new V2(0, 0), new V2(1, 2));
        V2 p1 = new V2(-0.5, -1);
        V2 p2 = new V2(-1,-1);
        assertTrue(e.contains(p1));
        assertFalse(e.contains(p2));

        assertFalse(e.move(new V2(2, 0)).contains(p1));
    }


    @org.junit.Test
    public void testEllipseQuadrantFour() throws Exception {
        Shape e = Shapes.makeEllipse(new V2(0, 0), new V2(1, 2));
        V2 p1 = new V2(0.5, -1);
        V2 p2 = new V2(1,-1);
        assertTrue(e.contains(p1));
        assertFalse(e.contains(p2));

        assertFalse(e.move(new V2(-2, 0)).contains(p1));
    }



    @org.junit.Test
    public void testPicture() throws Exception {
        Shape e = Shapes.makeEllipse(new V2(0, 0), new V2(2, 1));
        Shape r = Shapes.makeRectangle(new V2(0,2), new V2(1, 2));
        V2 p1 = new V2(0.5, 1);
        V2 p2 = new V2(1,1);

        Shape pict = Shapes.makePicture(Arrays.asList(e, r));

        assertTrue(pict.contains(p1));
        assertTrue(pict.contains(p2));
        assertFalse(pict.contains(new V2(2, 0.5)));


    }
}