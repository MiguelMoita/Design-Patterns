package StringBarTest;

import  Bar.*;
import Clients.HumanClient;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
public class RemoveObserverTest {
    @Test
    public void removeObserver() {
        Bar bar = new StringBar();
        HumanClient clientMock = Mockito.mock(HumanClient.class);
        bar.addObserver(clientMock);
        bar.removeObserver(clientMock);
        bar.startHappyHour();
        bar.endHappyHour();
        Mockito.verify(clientMock,Mockito.never()).happyHourStarted(bar);
        Mockito.verify(clientMock,Mockito.never()).happyHourEnded(bar);
    }
}
