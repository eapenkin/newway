/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.pojos;


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
public class TermSetHierarchy implements Serializable {

    private static final long serialVersionUID = 1389600306;

    private Long          id;
    private Long          versionId;
    private Integer       termSetHierarchyRefId;
    private String        name;
    private String        description;
    private Integer       parentTermsRefId;
    private String        termSetsJson;
    private LocalDateTime wtime;
    private Boolean       current;

    public TermSetHierarchy() {}

    public TermSetHierarchy(TermSetHierarchy value) {
        this.id = value.id;
        this.versionId = value.versionId;
        this.termSetHierarchyRefId = value.termSetHierarchyRefId;
        this.name = value.name;
        this.description = value.description;
        this.parentTermsRefId = value.parentTermsRefId;
        this.termSetsJson = value.termSetsJson;
        this.wtime = value.wtime;
        this.current = value.current;
    }

    public TermSetHierarchy(
        Long          id,
        Long          versionId,
        Integer       termSetHierarchyRefId,
        String        name,
        String        description,
        Integer       parentTermsRefId,
        String        termSetsJson,
        LocalDateTime wtime,
        Boolean       current
    ) {
        this.id = id;
        this.versionId = versionId;
        this.termSetHierarchyRefId = termSetHierarchyRefId;
        this.name = name;
        this.description = description;
        this.parentTermsRefId = parentTermsRefId;
        this.termSetsJson = termSetsJson;
        this.wtime = wtime;
        this.current = current;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersionId() {
        return this.versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Integer getTermSetHierarchyRefId() {
        return this.termSetHierarchyRefId;
    }

    public void setTermSetHierarchyRefId(Integer termSetHierarchyRefId) {
        this.termSetHierarchyRefId = termSetHierarchyRefId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParentTermsRefId() {
        return this.parentTermsRefId;
    }

    public void setParentTermsRefId(Integer parentTermsRefId) {
        this.parentTermsRefId = parentTermsRefId;
    }

    public String getTermSetsJson() {
        return this.termSetsJson;
    }

    public void setTermSetsJson(String termSetsJson) {
        this.termSetsJson = termSetsJson;
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
        final TermSetHierarchy other = (TermSetHierarchy) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (versionId == null) {
            if (other.versionId != null)
                return false;
        }
        else if (!versionId.equals(other.versionId))
            return false;
        if (termSetHierarchyRefId == null) {
            if (other.termSetHierarchyRefId != null)
                return false;
        }
        else if (!termSetHierarchyRefId.equals(other.termSetHierarchyRefId))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (parentTermsRefId == null) {
            if (other.parentTermsRefId != null)
                return false;
        }
        else if (!parentTermsRefId.equals(other.parentTermsRefId))
            return false;
        if (termSetsJson == null) {
            if (other.termSetsJson != null)
                return false;
        }
        else if (!termSetsJson.equals(other.termSetsJson))
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
        result = prime * result + ((this.versionId == null) ? 0 : this.versionId.hashCode());
        result = prime * result + ((this.termSetHierarchyRefId == null) ? 0 : this.termSetHierarchyRefId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.parentTermsRefId == null) ? 0 : this.parentTermsRefId.hashCode());
        result = prime * result + ((this.termSetsJson == null) ? 0 : this.termSetsJson.hashCode());
        result = prime * result + ((this.wtime == null) ? 0 : this.wtime.hashCode());
        result = prime * result + ((this.current == null) ? 0 : this.current.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TermSetHierarchy (");

        sb.append(id);
        sb.append(", ").append(versionId);
        sb.append(", ").append(termSetHierarchyRefId);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(parentTermsRefId);
        sb.append(", ").append(termSetsJson);
        sb.append(", ").append(wtime);
        sb.append(", ").append(current);

        sb.append(")");
        return sb.toString();
    }
}
