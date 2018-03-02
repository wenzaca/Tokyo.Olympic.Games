package com.tokyoolympicgames.manager.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Entity that contains the Localization of the Game in the Olympic Game
 *
 * @author Wendler Zacariotto
 */
@Entity
public class Localization implements Serializable {

    private static final long serialVersionUID = -4618887057839493441L;


    @Id
    @Column(name = "NAME")
    @NotNull
    @NotEmpty
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Localization country = (Localization) o;

        return new EqualsBuilder().append(name, country.name)
                                  .isEquals();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder(17, 37).append(name)
                                          .toHashCode();
    }

    @Override
    public String toString() {

        return name;
    }
}
