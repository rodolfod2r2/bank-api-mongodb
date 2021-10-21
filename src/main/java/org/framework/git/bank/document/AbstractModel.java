package org.framework.git.bank.document;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractModel extends AuditMetadata {
}
