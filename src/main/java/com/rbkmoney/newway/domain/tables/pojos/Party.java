/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.pojos;


import com.rbkmoney.newway.domain.enums.Blocking;
import com.rbkmoney.newway.domain.enums.Suspension;

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
public class Party implements Serializable {

    private static final long serialVersionUID = 1669058482;

    private Long          id;
    private Long          eventId;
    private LocalDateTime eventCreatedAt;
    private String        partyId;
    private String        contactInfoEmail;
    private LocalDateTime createdAt;
    private Blocking      blocking;
    private String        blockingUnblockedReason;
    private LocalDateTime blockingUnblockedSince;
    private String        blockingBlockedReason;
    private LocalDateTime blockingBlockedSince;
    private Suspension    suspension;
    private LocalDateTime suspensionActiveSince;
    private LocalDateTime suspensionSuspendedSince;
    private Long          revision;
    private LocalDateTime revisionChangedAt;
    private String        partyMetaSetNs;
    private String        partyMetaSetDataJson;
    private LocalDateTime wtime;
    private Boolean       current;

    public Party() {}

    public Party(Party value) {
        this.id = value.id;
        this.eventId = value.eventId;
        this.eventCreatedAt = value.eventCreatedAt;
        this.partyId = value.partyId;
        this.contactInfoEmail = value.contactInfoEmail;
        this.createdAt = value.createdAt;
        this.blocking = value.blocking;
        this.blockingUnblockedReason = value.blockingUnblockedReason;
        this.blockingUnblockedSince = value.blockingUnblockedSince;
        this.blockingBlockedReason = value.blockingBlockedReason;
        this.blockingBlockedSince = value.blockingBlockedSince;
        this.suspension = value.suspension;
        this.suspensionActiveSince = value.suspensionActiveSince;
        this.suspensionSuspendedSince = value.suspensionSuspendedSince;
        this.revision = value.revision;
        this.revisionChangedAt = value.revisionChangedAt;
        this.partyMetaSetNs = value.partyMetaSetNs;
        this.partyMetaSetDataJson = value.partyMetaSetDataJson;
        this.wtime = value.wtime;
        this.current = value.current;
    }

    public Party(
        Long          id,
        Long          eventId,
        LocalDateTime eventCreatedAt,
        String        partyId,
        String        contactInfoEmail,
        LocalDateTime createdAt,
        Blocking      blocking,
        String        blockingUnblockedReason,
        LocalDateTime blockingUnblockedSince,
        String        blockingBlockedReason,
        LocalDateTime blockingBlockedSince,
        Suspension    suspension,
        LocalDateTime suspensionActiveSince,
        LocalDateTime suspensionSuspendedSince,
        Long          revision,
        LocalDateTime revisionChangedAt,
        String        partyMetaSetNs,
        String        partyMetaSetDataJson,
        LocalDateTime wtime,
        Boolean       current
    ) {
        this.id = id;
        this.eventId = eventId;
        this.eventCreatedAt = eventCreatedAt;
        this.partyId = partyId;
        this.contactInfoEmail = contactInfoEmail;
        this.createdAt = createdAt;
        this.blocking = blocking;
        this.blockingUnblockedReason = blockingUnblockedReason;
        this.blockingUnblockedSince = blockingUnblockedSince;
        this.blockingBlockedReason = blockingBlockedReason;
        this.blockingBlockedSince = blockingBlockedSince;
        this.suspension = suspension;
        this.suspensionActiveSince = suspensionActiveSince;
        this.suspensionSuspendedSince = suspensionSuspendedSince;
        this.revision = revision;
        this.revisionChangedAt = revisionChangedAt;
        this.partyMetaSetNs = partyMetaSetNs;
        this.partyMetaSetDataJson = partyMetaSetDataJson;
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

    public String getPartyId() {
        return this.partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getContactInfoEmail() {
        return this.contactInfoEmail;
    }

    public void setContactInfoEmail(String contactInfoEmail) {
        this.contactInfoEmail = contactInfoEmail;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Blocking getBlocking() {
        return this.blocking;
    }

    public void setBlocking(Blocking blocking) {
        this.blocking = blocking;
    }

    public String getBlockingUnblockedReason() {
        return this.blockingUnblockedReason;
    }

    public void setBlockingUnblockedReason(String blockingUnblockedReason) {
        this.blockingUnblockedReason = blockingUnblockedReason;
    }

    public LocalDateTime getBlockingUnblockedSince() {
        return this.blockingUnblockedSince;
    }

    public void setBlockingUnblockedSince(LocalDateTime blockingUnblockedSince) {
        this.blockingUnblockedSince = blockingUnblockedSince;
    }

    public String getBlockingBlockedReason() {
        return this.blockingBlockedReason;
    }

    public void setBlockingBlockedReason(String blockingBlockedReason) {
        this.blockingBlockedReason = blockingBlockedReason;
    }

    public LocalDateTime getBlockingBlockedSince() {
        return this.blockingBlockedSince;
    }

    public void setBlockingBlockedSince(LocalDateTime blockingBlockedSince) {
        this.blockingBlockedSince = blockingBlockedSince;
    }

    public Suspension getSuspension() {
        return this.suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public LocalDateTime getSuspensionActiveSince() {
        return this.suspensionActiveSince;
    }

    public void setSuspensionActiveSince(LocalDateTime suspensionActiveSince) {
        this.suspensionActiveSince = suspensionActiveSince;
    }

    public LocalDateTime getSuspensionSuspendedSince() {
        return this.suspensionSuspendedSince;
    }

    public void setSuspensionSuspendedSince(LocalDateTime suspensionSuspendedSince) {
        this.suspensionSuspendedSince = suspensionSuspendedSince;
    }

    public Long getRevision() {
        return this.revision;
    }

    public void setRevision(Long revision) {
        this.revision = revision;
    }

    public LocalDateTime getRevisionChangedAt() {
        return this.revisionChangedAt;
    }

    public void setRevisionChangedAt(LocalDateTime revisionChangedAt) {
        this.revisionChangedAt = revisionChangedAt;
    }

    public String getPartyMetaSetNs() {
        return this.partyMetaSetNs;
    }

    public void setPartyMetaSetNs(String partyMetaSetNs) {
        this.partyMetaSetNs = partyMetaSetNs;
    }

    public String getPartyMetaSetDataJson() {
        return this.partyMetaSetDataJson;
    }

    public void setPartyMetaSetDataJson(String partyMetaSetDataJson) {
        this.partyMetaSetDataJson = partyMetaSetDataJson;
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
        final Party other = (Party) obj;
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
        if (partyId == null) {
            if (other.partyId != null)
                return false;
        }
        else if (!partyId.equals(other.partyId))
            return false;
        if (contactInfoEmail == null) {
            if (other.contactInfoEmail != null)
                return false;
        }
        else if (!contactInfoEmail.equals(other.contactInfoEmail))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (blocking == null) {
            if (other.blocking != null)
                return false;
        }
        else if (!blocking.equals(other.blocking))
            return false;
        if (blockingUnblockedReason == null) {
            if (other.blockingUnblockedReason != null)
                return false;
        }
        else if (!blockingUnblockedReason.equals(other.blockingUnblockedReason))
            return false;
        if (blockingUnblockedSince == null) {
            if (other.blockingUnblockedSince != null)
                return false;
        }
        else if (!blockingUnblockedSince.equals(other.blockingUnblockedSince))
            return false;
        if (blockingBlockedReason == null) {
            if (other.blockingBlockedReason != null)
                return false;
        }
        else if (!blockingBlockedReason.equals(other.blockingBlockedReason))
            return false;
        if (blockingBlockedSince == null) {
            if (other.blockingBlockedSince != null)
                return false;
        }
        else if (!blockingBlockedSince.equals(other.blockingBlockedSince))
            return false;
        if (suspension == null) {
            if (other.suspension != null)
                return false;
        }
        else if (!suspension.equals(other.suspension))
            return false;
        if (suspensionActiveSince == null) {
            if (other.suspensionActiveSince != null)
                return false;
        }
        else if (!suspensionActiveSince.equals(other.suspensionActiveSince))
            return false;
        if (suspensionSuspendedSince == null) {
            if (other.suspensionSuspendedSince != null)
                return false;
        }
        else if (!suspensionSuspendedSince.equals(other.suspensionSuspendedSince))
            return false;
        if (revision == null) {
            if (other.revision != null)
                return false;
        }
        else if (!revision.equals(other.revision))
            return false;
        if (revisionChangedAt == null) {
            if (other.revisionChangedAt != null)
                return false;
        }
        else if (!revisionChangedAt.equals(other.revisionChangedAt))
            return false;
        if (partyMetaSetNs == null) {
            if (other.partyMetaSetNs != null)
                return false;
        }
        else if (!partyMetaSetNs.equals(other.partyMetaSetNs))
            return false;
        if (partyMetaSetDataJson == null) {
            if (other.partyMetaSetDataJson != null)
                return false;
        }
        else if (!partyMetaSetDataJson.equals(other.partyMetaSetDataJson))
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
        result = prime * result + ((this.partyId == null) ? 0 : this.partyId.hashCode());
        result = prime * result + ((this.contactInfoEmail == null) ? 0 : this.contactInfoEmail.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.blocking == null) ? 0 : this.blocking.hashCode());
        result = prime * result + ((this.blockingUnblockedReason == null) ? 0 : this.blockingUnblockedReason.hashCode());
        result = prime * result + ((this.blockingUnblockedSince == null) ? 0 : this.blockingUnblockedSince.hashCode());
        result = prime * result + ((this.blockingBlockedReason == null) ? 0 : this.blockingBlockedReason.hashCode());
        result = prime * result + ((this.blockingBlockedSince == null) ? 0 : this.blockingBlockedSince.hashCode());
        result = prime * result + ((this.suspension == null) ? 0 : this.suspension.hashCode());
        result = prime * result + ((this.suspensionActiveSince == null) ? 0 : this.suspensionActiveSince.hashCode());
        result = prime * result + ((this.suspensionSuspendedSince == null) ? 0 : this.suspensionSuspendedSince.hashCode());
        result = prime * result + ((this.revision == null) ? 0 : this.revision.hashCode());
        result = prime * result + ((this.revisionChangedAt == null) ? 0 : this.revisionChangedAt.hashCode());
        result = prime * result + ((this.partyMetaSetNs == null) ? 0 : this.partyMetaSetNs.hashCode());
        result = prime * result + ((this.partyMetaSetDataJson == null) ? 0 : this.partyMetaSetDataJson.hashCode());
        result = prime * result + ((this.wtime == null) ? 0 : this.wtime.hashCode());
        result = prime * result + ((this.current == null) ? 0 : this.current.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Party (");

        sb.append(id);
        sb.append(", ").append(eventId);
        sb.append(", ").append(eventCreatedAt);
        sb.append(", ").append(partyId);
        sb.append(", ").append(contactInfoEmail);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(blocking);
        sb.append(", ").append(blockingUnblockedReason);
        sb.append(", ").append(blockingUnblockedSince);
        sb.append(", ").append(blockingBlockedReason);
        sb.append(", ").append(blockingBlockedSince);
        sb.append(", ").append(suspension);
        sb.append(", ").append(suspensionActiveSince);
        sb.append(", ").append(suspensionSuspendedSince);
        sb.append(", ").append(revision);
        sb.append(", ").append(revisionChangedAt);
        sb.append(", ").append(partyMetaSetNs);
        sb.append(", ").append(partyMetaSetDataJson);
        sb.append(", ").append(wtime);
        sb.append(", ").append(current);

        sb.append(")");
        return sb.toString();
    }
}