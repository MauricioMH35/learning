package org.learning.crud.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "cruds")
public class Crud implements Serializable {

    public final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Character prefix;

    public String description;

    public String method;

    public Integer statusCode;

    public String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getPrefix() {
        return prefix;
    }

    public void setPrefix(Character prefix) {
        this.prefix = prefix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Crud() {

    }

    public Crud(Long id, Character prefix, String description, String method,
                Integer statusCode, String status) {
        this.prefix = prefix;
        this.description = description;
        this.method = method;
        this.statusCode = statusCode;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crud crud = (Crud) o;
        return Objects.equals(id, crud.id) &&
                Objects.equals(prefix, crud.prefix) &&
                Objects.equals(description, crud.description) &&
                Objects.equals(method, crud.method) &&
                Objects.equals(statusCode, crud.statusCode) &&
                Objects.equals(status, crud.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prefix, description, method, statusCode, status);
    }

    @Override
    public String toString() {
        return "Crud{" +
                "id=" + id +
                "prefix=" + prefix +
                ", description='" + description + '\'' +
                ", method='" + method + '\'' +
                ", statusCode=" + statusCode +
                ", status='" + status + '\'' +
                '}';
    }
}
