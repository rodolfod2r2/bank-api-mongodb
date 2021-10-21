package org.framework.git.bank.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String addressType;
    private boolean addressPreferred;
    private String postalCode;
    private String streetLine1;
    private String streetLine2;
    private String streetLine3;
    private String streetLine4;
    private String city;
    private String state;
    private String country;

}
