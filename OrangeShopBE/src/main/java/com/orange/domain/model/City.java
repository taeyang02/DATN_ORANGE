package com.orange.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "city")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class City {
    /*@NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Region region;*/

    @Id
    private Long id;

    @Size(max = 45)
    @NotNull
    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "status")
    @JsonIgnore
    private Boolean status;

    @OneToMany(mappedBy = "city")
    @JsonIgnore
    private Set<District> districts;

}