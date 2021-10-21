package org.framework.git.bank.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Card")
public class Card extends AbstractModel {

    private AbstractModel user;
    private Account account;
    private String cardNumber;
    private String cardPassword;
    private String cardType;
    private String cardCreate;
    private String cardStatus;
    private BigDecimal cardCreditLimit;
    private BigDecimal cardOverdraftLimit;
    private boolean cardOnlinePay;
    private boolean cardMobilePay;
    private boolean cardCashBackPay;
    private boolean cardOverdraft;

}