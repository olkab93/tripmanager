package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PhotoTest {

    private Photo photo;

    @Before
    public void CreateDataForPhotoTest() {
        photo = new Photo("Photo comment");
    }

    @Test
    public void setCommentTest() {
        assertTrue(photo.getComment() == "Photo comment");
    }


}
