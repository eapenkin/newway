/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.pojos;


import com.rbkmoney.newway.domain.enums.BankCardPaymentSystem;
import com.rbkmoney.newway.domain.enums.WithdrawalSessionStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class WithdrawalSession implements Serializable {

    private static final long serialVersionUID = 1345427918;

    private Long                    id;
    private Long                    eventId;
    private LocalDateTime           eventCreatedAt;
    private LocalDateTime           eventOccuredAt;
    private Integer                 sequenceId;
    private String                  withdrawalSessionId;
    private WithdrawalSessionStatus withdrawalSessionStatus;
    private String                  providerId;
    private String                  withdrawalId;
    private String                  destinationName;
    private String                  destinationCardToken;
    private BankCardPaymentSystem   destinationCardPaymentSystem;
    private String                  destinationCardBin;
    private String                  destinationCardMaskedPan;
    private Long                    amount;
    private String                  currencyCode;
    private String                  senderPartyId;
    private String                  senderProviderId;
    private String                  senderClassId;
    private String                  senderContractId;
    private String                  receiverPartyId;
    private String                  receiverProviderId;
    private String                  receiverClassId;
    private String                  receiverContractId;
    private String                  adapterState;
    private String                  tranInfoId;
    private LocalDateTime           tranInfoTimestamp;
    private String                  tranInfoJson;
    private LocalDateTime           wtime;
    private Boolean                 current;

    public WithdrawalSession() {}

    public WithdrawalSession(WithdrawalSession value) {
        this.id = value.id;
        this.eventId = value.eventId;
        this.eventCreatedAt = value.eventCreatedAt;
        this.eventOccuredAt = value.eventOccuredAt;
        this.sequenceId = value.sequenceId;
        this.withdrawalSessionId = value.withdrawalSessionId;
        this.withdrawalSessionStatus = value.withdrawalSessionStatus;
        this.providerId = value.providerId;
        this.withdrawalId = value.withdrawalId;
        this.destinationName = value.destinationName;
        this.destinationCardToken = value.destinationCardToken;
        this.destinationCardPaymentSystem = value.destinationCardPaymentSystem;
        this.destinationCardBin = value.destinationCardBin;
        this.destinationCardMaskedPan = value.destinationCardMaskedPan;
        this.amount = value.amount;
        this.currencyCode = value.currencyCode;
        this.senderPartyId = value.senderPartyId;
        this.senderProviderId = value.senderProviderId;
        this.senderClassId = value.senderClassId;
        this.senderContractId = value.senderContractId;
        this.receiverPartyId = value.receiverPartyId;
        this.receiverProviderId = value.receiverProviderId;
        this.receiverClassId = value.receiverClassId;
        this.receiverContractId = value.receiverContractId;
        this.adapterState = value.adapterState;
        this.tranInfoId = value.tranInfoId;
        this.tranInfoTimestamp = value.tranInfoTimestamp;
        this.tranInfoJson = value.tranInfoJson;
        this.wtime = value.wtime;
        this.current = value.current;
    }

    public WithdrawalSession(
        Long                    id,
        Long                    eventId,
        LocalDateTime           eventCreatedAt,
        LocalDateTime           eventOccuredAt,
        Integer                 sequenceId,
        String                  withdrawalSessionId,
        WithdrawalSessionStatus withdrawalSessionStatus,
        String                  providerId,
        String                  withdrawalId,
        String                  destinationName,
        String                  destinationCardToken,
        BankCardPaymentSystem   destinationCardPaymentSystem,
        String                  destinationCardBin,
        String                  destinationCardMaskedPan,
        Long                    amount,
        String                  currencyCode,
        String                  senderPartyId,
        String                  senderProviderId,
        String                  senderClassId,
        String                  senderContractId,
        String                  receiverPartyId,
        String                  receiverProviderId,
        String                  receiverClassId,
        String                  receiverContractId,
        String                  adapterState,
        String                  tranInfoId,
        LocalDateTime           tranInfoTimestamp,
        String                  tranInfoJson,
        LocalDateTime           wtime,
        Boolean                 current
    ) {
        this.id = id;
        this.eventId = eventId;
        this.eventCreatedAt = eventCreatedAt;
        this.eventOccuredAt = eventOccuredAt;
        this.sequenceId = sequenceId;
        this.withdrawalSessionId = withdrawalSessionId;
        this.withdrawalSessionStatus = withdrawalSessionStatus;
        this.providerId = providerId;
        this.withdrawalId = withdrawalId;
        this.destinationName = destinationName;
        this.destinationCardToken = destinationCardToken;
        this.destinationCardPaymentSystem = destinationCardPaymentSystem;
        this.destinationCardBin = destinationCardBin;
        this.destinationCardMaskedPan = destinationCardMaskedPan;
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.senderPartyId = senderPartyId;
        this.senderProviderId = senderProviderId;
        this.senderClassId = senderClassId;
        this.senderContractId = senderContractId;
        this.receiverPartyId = receiverPartyId;
        this.receiverProviderId = receiverProviderId;
        this.receiverClassId = receiverClassId;
        this.receiverContractId = receiverContractId;
        this.adapterState = adapterState;
        this.tranInfoId = tranInfoId;
        this.tranInfoTimestamp = tranInfoTimestamp;
        this.tranInfoJson = tranInfoJson;
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

    public LocalDateTime getEventOccuredAt() {
        return this.eventOccuredAt;
    }

    public void setEventOccuredAt(LocalDateTime eventOccuredAt) {
        this.eventOccuredAt = eventOccuredAt;
    }

    public Integer getSequenceId() {
        return this.sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getWithdrawalSessionId() {
        return this.withdrawalSessionId;
    }

    public void setWithdrawalSessionId(String withdrawalSessionId) {
        this.withdrawalSessionId = withdrawalSessionId;
    }

    public WithdrawalSessionStatus getWithdrawalSessionStatus() {
        return this.withdrawalSessionStatus;
    }

    public void setWithdrawalSessionStatus(WithdrawalSessionStatus withdrawalSessionStatus) {
        this.withdrawalSessionStatus = withdrawalSessionStatus;
    }

    public String getProviderId() {
        return this.providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getWithdrawalId() {
        return this.withdrawalId;
    }

    public void setWithdrawalId(String withdrawalId) {
        this.withdrawalId = withdrawalId;
    }

    public String getDestinationName() {
        return this.destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationCardToken() {
        return this.destinationCardToken;
    }

    public void setDestinationCardToken(String destinationCardToken) {
        this.destinationCardToken = destinationCardToken;
    }

    public BankCardPaymentSystem getDestinationCardPaymentSystem() {
        return this.destinationCardPaymentSystem;
    }

    public void setDestinationCardPaymentSystem(BankCardPaymentSystem destinationCardPaymentSystem) {
        this.destinationCardPaymentSystem = destinationCardPaymentSystem;
    }

    public String getDestinationCardBin() {
        return this.destinationCardBin;
    }

    public void setDestinationCardBin(String destinationCardBin) {
        this.destinationCardBin = destinationCardBin;
    }

    public String getDestinationCardMaskedPan() {
        return this.destinationCardMaskedPan;
    }

    public void setDestinationCardMaskedPan(String destinationCardMaskedPan) {
        this.destinationCardMaskedPan = destinationCardMaskedPan;
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

    public String getSenderPartyId() {
        return this.senderPartyId;
    }

    public void setSenderPartyId(String senderPartyId) {
        this.senderPartyId = senderPartyId;
    }

    public String getSenderProviderId() {
        return this.senderProviderId;
    }

    public void setSenderProviderId(String senderProviderId) {
        this.senderProviderId = senderProviderId;
    }

    public String getSenderClassId() {
        return this.senderClassId;
    }

    public void setSenderClassId(String senderClassId) {
        this.senderClassId = senderClassId;
    }

    public String getSenderContractId() {
        return this.senderContractId;
    }

    public void setSenderContractId(String senderContractId) {
        this.senderContractId = senderContractId;
    }

    public String getReceiverPartyId() {
        return this.receiverPartyId;
    }

    public void setReceiverPartyId(String receiverPartyId) {
        this.receiverPartyId = receiverPartyId;
    }

    public String getReceiverProviderId() {
        return this.receiverProviderId;
    }

    public void setReceiverProviderId(String receiverProviderId) {
        this.receiverProviderId = receiverProviderId;
    }

    public String getReceiverClassId() {
        return this.receiverClassId;
    }

    public void setReceiverClassId(String receiverClassId) {
        this.receiverClassId = receiverClassId;
    }

    public String getReceiverContractId() {
        return this.receiverContractId;
    }

    public void setReceiverContractId(String receiverContractId) {
        this.receiverContractId = receiverContractId;
    }

    public String getAdapterState() {
        return this.adapterState;
    }

    public void setAdapterState(String adapterState) {
        this.adapterState = adapterState;
    }

    public String getTranInfoId() {
        return this.tranInfoId;
    }

    public void setTranInfoId(String tranInfoId) {
        this.tranInfoId = tranInfoId;
    }

    public LocalDateTime getTranInfoTimestamp() {
        return this.tranInfoTimestamp;
    }

    public void setTranInfoTimestamp(LocalDateTime tranInfoTimestamp) {
        this.tranInfoTimestamp = tranInfoTimestamp;
    }

    public String getTranInfoJson() {
        return this.tranInfoJson;
    }

    public void setTranInfoJson(String tranInfoJson) {
        this.tranInfoJson = tranInfoJson;
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
        final WithdrawalSession other = (WithdrawalSession) obj;
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
        if (eventOccuredAt == null) {
            if (other.eventOccuredAt != null)
                return false;
        }
        else if (!eventOccuredAt.equals(other.eventOccuredAt))
            return false;
        if (sequenceId == null) {
            if (other.sequenceId != null)
                return false;
        }
        else if (!sequenceId.equals(other.sequenceId))
            return false;
        if (withdrawalSessionId == null) {
            if (other.withdrawalSessionId != null)
                return false;
        }
        else if (!withdrawalSessionId.equals(other.withdrawalSessionId))
            return false;
        if (withdrawalSessionStatus == null) {
            if (other.withdrawalSessionStatus != null)
                return false;
        }
        else if (!withdrawalSessionStatus.equals(other.withdrawalSessionStatus))
            return false;
        if (providerId == null) {
            if (other.providerId != null)
                return false;
        }
        else if (!providerId.equals(other.providerId))
            return false;
        if (withdrawalId == null) {
            if (other.withdrawalId != null)
                return false;
        }
        else if (!withdrawalId.equals(other.withdrawalId))
            return false;
        if (destinationName == null) {
            if (other.destinationName != null)
                return false;
        }
        else if (!destinationName.equals(other.destinationName))
            return false;
        if (destinationCardToken == null) {
            if (other.destinationCardToken != null)
                return false;
        }
        else if (!destinationCardToken.equals(other.destinationCardToken))
            return false;
        if (destinationCardPaymentSystem == null) {
            if (other.destinationCardPaymentSystem != null)
                return false;
        }
        else if (!destinationCardPaymentSystem.equals(other.destinationCardPaymentSystem))
            return false;
        if (destinationCardBin == null) {
            if (other.destinationCardBin != null)
                return false;
        }
        else if (!destinationCardBin.equals(other.destinationCardBin))
            return false;
        if (destinationCardMaskedPan == null) {
            if (other.destinationCardMaskedPan != null)
                return false;
        }
        else if (!destinationCardMaskedPan.equals(other.destinationCardMaskedPan))
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
        if (senderPartyId == null) {
            if (other.senderPartyId != null)
                return false;
        }
        else if (!senderPartyId.equals(other.senderPartyId))
            return false;
        if (senderProviderId == null) {
            if (other.senderProviderId != null)
                return false;
        }
        else if (!senderProviderId.equals(other.senderProviderId))
            return false;
        if (senderClassId == null) {
            if (other.senderClassId != null)
                return false;
        }
        else if (!senderClassId.equals(other.senderClassId))
            return false;
        if (senderContractId == null) {
            if (other.senderContractId != null)
                return false;
        }
        else if (!senderContractId.equals(other.senderContractId))
            return false;
        if (receiverPartyId == null) {
            if (other.receiverPartyId != null)
                return false;
        }
        else if (!receiverPartyId.equals(other.receiverPartyId))
            return false;
        if (receiverProviderId == null) {
            if (other.receiverProviderId != null)
                return false;
        }
        else if (!receiverProviderId.equals(other.receiverProviderId))
            return false;
        if (receiverClassId == null) {
            if (other.receiverClassId != null)
                return false;
        }
        else if (!receiverClassId.equals(other.receiverClassId))
            return false;
        if (receiverContractId == null) {
            if (other.receiverContractId != null)
                return false;
        }
        else if (!receiverContractId.equals(other.receiverContractId))
            return false;
        if (adapterState == null) {
            if (other.adapterState != null)
                return false;
        }
        else if (!adapterState.equals(other.adapterState))
            return false;
        if (tranInfoId == null) {
            if (other.tranInfoId != null)
                return false;
        }
        else if (!tranInfoId.equals(other.tranInfoId))
            return false;
        if (tranInfoTimestamp == null) {
            if (other.tranInfoTimestamp != null)
                return false;
        }
        else if (!tranInfoTimestamp.equals(other.tranInfoTimestamp))
            return false;
        if (tranInfoJson == null) {
            if (other.tranInfoJson != null)
                return false;
        }
        else if (!tranInfoJson.equals(other.tranInfoJson))
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
        result = prime * result + ((this.eventOccuredAt == null) ? 0 : this.eventOccuredAt.hashCode());
        result = prime * result + ((this.sequenceId == null) ? 0 : this.sequenceId.hashCode());
        result = prime * result + ((this.withdrawalSessionId == null) ? 0 : this.withdrawalSessionId.hashCode());
        result = prime * result + ((this.withdrawalSessionStatus == null) ? 0 : this.withdrawalSessionStatus.hashCode());
        result = prime * result + ((this.providerId == null) ? 0 : this.providerId.hashCode());
        result = prime * result + ((this.withdrawalId == null) ? 0 : this.withdrawalId.hashCode());
        result = prime * result + ((this.destinationName == null) ? 0 : this.destinationName.hashCode());
        result = prime * result + ((this.destinationCardToken == null) ? 0 : this.destinationCardToken.hashCode());
        result = prime * result + ((this.destinationCardPaymentSystem == null) ? 0 : this.destinationCardPaymentSystem.hashCode());
        result = prime * result + ((this.destinationCardBin == null) ? 0 : this.destinationCardBin.hashCode());
        result = prime * result + ((this.destinationCardMaskedPan == null) ? 0 : this.destinationCardMaskedPan.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.currencyCode == null) ? 0 : this.currencyCode.hashCode());
        result = prime * result + ((this.senderPartyId == null) ? 0 : this.senderPartyId.hashCode());
        result = prime * result + ((this.senderProviderId == null) ? 0 : this.senderProviderId.hashCode());
        result = prime * result + ((this.senderClassId == null) ? 0 : this.senderClassId.hashCode());
        result = prime * result + ((this.senderContractId == null) ? 0 : this.senderContractId.hashCode());
        result = prime * result + ((this.receiverPartyId == null) ? 0 : this.receiverPartyId.hashCode());
        result = prime * result + ((this.receiverProviderId == null) ? 0 : this.receiverProviderId.hashCode());
        result = prime * result + ((this.receiverClassId == null) ? 0 : this.receiverClassId.hashCode());
        result = prime * result + ((this.receiverContractId == null) ? 0 : this.receiverContractId.hashCode());
        result = prime * result + ((this.adapterState == null) ? 0 : this.adapterState.hashCode());
        result = prime * result + ((this.tranInfoId == null) ? 0 : this.tranInfoId.hashCode());
        result = prime * result + ((this.tranInfoTimestamp == null) ? 0 : this.tranInfoTimestamp.hashCode());
        result = prime * result + ((this.tranInfoJson == null) ? 0 : this.tranInfoJson.hashCode());
        result = prime * result + ((this.wtime == null) ? 0 : this.wtime.hashCode());
        result = prime * result + ((this.current == null) ? 0 : this.current.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WithdrawalSession (");

        sb.append(id);
        sb.append(", ").append(eventId);
        sb.append(", ").append(eventCreatedAt);
        sb.append(", ").append(eventOccuredAt);
        sb.append(", ").append(sequenceId);
        sb.append(", ").append(withdrawalSessionId);
        sb.append(", ").append(withdrawalSessionStatus);
        sb.append(", ").append(providerId);
        sb.append(", ").append(withdrawalId);
        sb.append(", ").append(destinationName);
        sb.append(", ").append(destinationCardToken);
        sb.append(", ").append(destinationCardPaymentSystem);
        sb.append(", ").append(destinationCardBin);
        sb.append(", ").append(destinationCardMaskedPan);
        sb.append(", ").append(amount);
        sb.append(", ").append(currencyCode);
        sb.append(", ").append(senderPartyId);
        sb.append(", ").append(senderProviderId);
        sb.append(", ").append(senderClassId);
        sb.append(", ").append(senderContractId);
        sb.append(", ").append(receiverPartyId);
        sb.append(", ").append(receiverProviderId);
        sb.append(", ").append(receiverClassId);
        sb.append(", ").append(receiverContractId);
        sb.append(", ").append(adapterState);
        sb.append(", ").append(tranInfoId);
        sb.append(", ").append(tranInfoTimestamp);
        sb.append(", ").append(tranInfoJson);
        sb.append(", ").append(wtime);
        sb.append(", ").append(current);

        sb.append(")");
        return sb.toString();
    }
}
