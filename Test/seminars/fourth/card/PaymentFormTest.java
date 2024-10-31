package seminars.fourth.card;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PaymentFormTest {

    @Test
    public void TestPaymentForm() {
        CreditCard mockCreditCard = mock(CreditCard.class);

        when(mockCreditCard.getCardNumber()).thenReturn("1234567812345678");
        when(mockCreditCard.getCardHolder()).thenReturn("Test User");
        when(mockCreditCard.getExpiryDate()).thenReturn("01/23");
        when(mockCreditCard.getCvv()).thenReturn("123");

        PaymentForm paymentForm = new PaymentForm(mockCreditCard);
        paymentForm.pay(100);
        verify(mockCreditCard, times(1)).charge(100);
    }



}