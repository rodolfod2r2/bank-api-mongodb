package org.framework.git.bank.document;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class AuditMetadata {

    @Id
    private String id;
    @CreatedBy
    private String createdByUser;
    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
    @LastModifiedBy
    private String modifiedByUser;

}
