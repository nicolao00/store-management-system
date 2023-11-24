package edu.dongguk.cs25server.domain

import edu.dongguk.cs25server.domain.type.UserRole
import jakarta.persistence.*
import org.hibernate.annotations.DynamicUpdate

@Entity
@DynamicUpdate
@Table(name = "headquarters")
class Headquarters(
    @Column(name = "login_id")
    private val loginId: String,

    @Column(name = "password")
    private var password: String,

    @Column(name = "headquarters_tel")
    private var headquartersTel: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    val role: UserRole
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "headquarters_id")
    private val id: Long? = null

    @Column(name = "is_login")
    private var isLogin: Boolean ?= null

    @Column(name = "refresh_token")
    private var refreshToken: String? = null

    /*--------------------연관 관계 매핑--------------------*/
    @OneToMany(mappedBy = "headquarters")
    private val itemHQs: MutableList<ItemHQ> = mutableListOf()

    /*--------------------메서드--------------------*/
}