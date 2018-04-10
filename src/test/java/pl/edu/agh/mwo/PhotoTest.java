package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PhotoTest {

    private Photo photo;

    @Before
    public void CreateDataForPhotoTest() {
        photo = new Photo();
    }

    @Test
    public void setCommentTest() {
        photo.setComment("Comment to the photo");
        assertTrue(photo.getComment() == "Comment to the photo");
    }


}
