package seminars.fourth;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class MainTest {

     @Test
    public void simpleTest() {

        List<String> mockedList = mock(List.class);

        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

      @Test
      public void iteratorWillReturnHelloWorld() {
          Iterator iteratorMock = mock(Iterator.class);
          when(iteratorMock.next()).thenReturn("Hello").thenReturn("World");
          String result = iteratorMock.next() + " " + iteratorMock.next();
          assertEquals("Hello World", result);
      }

}