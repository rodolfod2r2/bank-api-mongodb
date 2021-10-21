package org.framework.git.bank.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Account")
public class Account {

    private String accountBankNumber;
    private String accountNumber;
    private String accountType;
    private String accountCreate;
    private String accountStatus;
    private BigDecimal accountCreditLimit;
    private BigDecimal accountOverdraftLimit;
    private boolean accountOnlinePay;
    private boolean accountMobilePay;
    private boolean accountCashBackPay;
    private boolean accountOverdraft;
    private AbstractModel accountUser;
    private List<Address> accountBankAddress;
    private List<Phone> accountBankPhones;

}