/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.pojos;


import com.rbkmoney.newway.domain.enums.Invoicestatus;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1890278354;

    private Long          id;
    private Long          eventId;
    private LocalDateTime eventCreatedAt;
    private String        invoiceId;
    private String        partyId;
    private String        shopId;
    private Long          partyRevision;
    private LocalDateTime createdAt;
    private Invoicestatus status;
    private String        statusCancelledDetails;
    private String        statusFulfilledDetails;
    private String        detailsProduct;
    private String        detailsDescription;
    private LocalDateTime due;
    private Long          amount;
    private String        currencyCode;
    private byte[]        context;
    private String        templateId;
    private LocalDateTime wtime;
    private Boolean       current;

    public Invoice() {}

    public Invoice(Invoice value) {
        this.id = value.id;
        this.eventId = value.eventId;
        this.eventCreatedAt = value.eventCreatedAt;
        this.invoiceId = value.invoiceId;
        this.partyId = value.partyId;
        this.shopId = value.shopId;
        this.partyRevision = value.partyRevision;
        this.createdAt = value.createdAt;
        this.status = value.status;
        this.statusCancelledDetails = value.statusCancelledDetails;
        this.statusFulfilledDetails = value.statusFulfilledDetails;
        this.detailsProduct = value.detailsProduct;
        this.detailsDescription = value.detailsDescription;
        this.due = value.due;
        this.amount = value.amount;
        this.currencyCode = value.currencyCode;
        this.context = value.context;
        this.templateId = value.templateId;
        this.wtime = value.wtime;
        this.current = value.current;
    }

    public Invoice(
        Long          id,
        Long          eventId,
        LocalDateTime eventCreatedAt,
        String        invoiceId,
        String        partyId,
        String        shopId,
        Long          partyRevision,
        LocalDateTime createdAt,
        Invoicestatus status,
        String        statusCancelledDetails,
        String        statusFulfilledDetails,
        String        detailsProduct,
        String        detailsDescription,
        LocalDateTime due,
        Long          amount,
        String        currencyCode,
        byte[]        context,
        String        templateId,
        LocalDateTime wtime,
        Boolean       current
    ) {
        this.id = id;
        this.eventId = eventId;
        this.eventCreatedAt = eventCreatedAt;
        this.invoiceId = invoiceId;
        this.partyId = partyId;
        this.shopId = shopId;
        this.partyRevision = partyRevision;
        this.createdAt = createdAt;
        this.status = status;
        this.statusCancelledDetails = statusCancelledDetails;
        this.statusFulfilledDetails = statusFulfilledDetails;
        this.detailsProduct = detailsProduct;
        this.detailsDescription = detailsDescription;
        this.due = due;
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.context = context;
        this.templateId = templateId;
        this.wtime = wtime;
        this.current = current;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return this.eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public LocalDateTime getEventCreatedAt() {
        return this.eventCreatedAt;
    }

    public void setEventCreatedAt(LocalDateTime eventCreatedAt) {
        this.eventCreatedAt = eventCreatedAt;
    }

    public String getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getPartyId() {
        return this.partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Long getPartyRevision() {
        return this.partyRevision;
    }

    public void setPartyRevision(Long partyRevision) {
        this.partyRevision = partyRevision;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Invoicestatus getStatus() {
        return this.status;
    }

    public void setStatus(Invoicestatus status) {
        this.status = status;
    }

    public String getStatusCancelledDetails() {
        return this.statusCancelledDetails;
    }

    public void setStatusCancelledDetails(String statusCancelledDetails) {
        this.statusCancelledDetails = statusCancelledDetails;
    }

    public String getStatusFulfilledDetails() {
        return this.statusFulfilledDetails;
    }

    public void setStatusFulfilledDetails(String statusFulfilledDetails) {
        this.statusFulfilledDetails = statusFulfilledDetails;
    }

    public String getDetailsProduct() {
        return this.detailsProduct;
    }

    public void setDetailsProduct(String detailsProduct) {
        this.detailsProduct = detailsProduct;
    }

    public String getDetailsDescription() {
        return this.detailsDescription;
    }

    public void setDetailsDescription(String detailsDescription) {
        this.detailsDescription = detailsDescription;
    }

    public LocalDateTime getDue() {
        return this.due;
    }

    public void setDue(LocalDateTime due) {
        this.due = due;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public byte[] getContext() {
        return this.context;
    }

    public void setContext(byte... context) {
        this.context = context;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public LocalDateTime getWtime() {
        return this.wtime;
    }

    public void setWtime(LocalDateTime wtime) {
        this.wtime = wtime;
    }

    public Boolean getCurrent() {
        return this.current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Invoice other = (Invoice) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (eventId == null) {
            if (other.eventId != null)
                return false;
        }
        else if (!eventId.equals(other.eventId))
            return false;
        if (eventCreatedAt == null) {
            if (other.eventCreatedAt != null)
                return false;
        }
        else if (!eventCreatedAt.equals(other.eventCreatedAt))
            return false;
        if (invoiceId == null) {
            if (other.invoiceId != null)
                return false;
        }
        else if (!invoiceId.equals(other.invoiceId))
            return false;
        if (partyId == null) {
            if (other.partyId != null)
                return false;
        }
        else if (!partyId.equals(other.partyId))
            return false;
        if (shopId == null) {
            if (other.shopId != null)
                return false;
        }
        else if (!shopId.equals(other.shopId))
            return false;
        if (partyRevision == null) {
            if (other.partyRevision != null)
                return false;
        }
        else if (!partyRevision.equals(other.partyRevision))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (statusCancelledDetails == null) {
            if (other.statusCancelledDetails != null)
                return false;
        }
        else if (!statusCancelledDetails.equals(other.statusCancelledDetails))
            return false;
        if (statusFulfilledDetails == null) {
            if (other.statusFulfilledDetails != null)
                return false;
        }
        else if (!statusFulfilledDetails.equals(other.statusFulfilledDetails))
            return false;
        if (detailsProduct == null) {
            if (other.detailsProduct != null)
                return false;
        }
        else if (!detailsProduct.equals(other.detailsProduct))
            return false;
        if (detailsDescription == null) {
            if (other.detailsDescription != null)
                return false;
        }
        else if (!detailsDescription.equals(other.detailsDescription))
            return false;
        if (due == null) {
            if (other.due != null)
                return false;
        }
        else if (!due.equals(other.due))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!amount.equals(other.amount))
            return false;
        if (currencyCode == null) {
            if (other.currencyCode != null)
                return false;
        }
        else if (!currencyCode.equals(other.currencyCode))
            return false;
        if (context == null) {
            if (other.context != null)
                return false;
        }
        else if (!Arrays.equals(context, other.context))
            return false;
        if (templateId == null) {
            if (other.templateId != null)
                return false;
        }
        else if (!templateId.equals(other.templateId))
            return false;
        if (wtime == null) {
            if (other.wtime != null)
                return false;
        }
        else if (!wtime.equals(other.wtime))
            return false;
        if (current == null) {
            if (other.current != null)
                return false;
        }
        else if (!current.equals(other.current))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.eventId == null) ? 0 : this.eventId.hashCode());
        result = prime * result + ((this.eventCreatedAt == null) ? 0 : this.eventCreatedAt.hashCode());
        result = prime * result + ((this.invoiceId == null) ? 0 : this.invoiceId.hashCode());
        result = prime * result + ((this.partyId == null) ? 0 : this.partyId.hashCode());
        result = prime * result + ((this.shopId == null) ? 0 : this.shopId.hashCode());
        result = prime * result + ((this.partyRevision == null) ? 0 : this.partyRevision.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.statusCancelledDetails == null) ? 0 : this.statusCancelledDetails.hashCode());
        result = prime * result + ((this.statusFulfilledDetails == null) ? 0 : this.statusFulfilledDetails.hashCode());
        result = prime * result + ((this.detailsProduct == null) ? 0 : this.detailsProduct.hashCode());
        result = prime * result + ((this.detailsDescription == null) ? 0 : this.detailsDescription.hashCode());
        result = prime * result + ((this.due == null) ? 0 : this.due.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.currencyCode == null) ? 0 : this.currencyCode.hashCode());
        result = prime * result + ((this.context == null) ? 0 : Arrays.hashCode(this.context));
        result = prime * result + ((this.templateId == null) ? 0 : this.templateId.hashCode());
        result = prime * result + ((this.wtime == null) ? 0 : this.wtime.hashCode());
        result = prime * result + ((this.current == null) ? 0 : this.current.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Invoice (");

        sb.append(id);
        sb.append(", ").append(eventId);
        sb.append(", ").append(eventCreatedAt);
        sb.append(", ").append(invoiceId);
        sb.append(", ").append(partyId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(partyRevision);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(status);
        sb.append(", ").append(statusCancelledDetails);
        sb.append(", ").append(statusFulfilledDetails);
        sb.append(", ").append(detailsProduct);
        sb.append(", ").append(detailsDescription);
        sb.append(", ").append(due);
        sb.append(", ").append(amount);
        sb.append(", ").append(currencyCode);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(templateId);
        sb.append(", ").append(wtime);
        sb.append(", ").append(current);

        sb.append(")");
        return sb.toString();
    }
}