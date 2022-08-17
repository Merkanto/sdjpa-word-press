package merkanto.sdjpawordpress.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

import java.sql.Timestamp;

@Entity
@Table(name = "wp_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 60)
    @Column(name = "user_login")
    private String login;

    @NotNull
    @Size(max = 255)
    @Column(name = "user_pass")
    private String password;

    @NotNull
    @Size(max = 50)
    @Column(name = "user_nicename")
    private String nicename;

    @Email
    @NotNull
    @Size(max = 100)
    @Column(name = "user_email")
    private String email;

    @URL
    @NotNull
    @Size(max = 100)
    @Column(name = "user_url")
    private String url;

    @NotNull
    @Column(name = "user_registered")
    private Timestamp registered;

    @NotNull
    @Size(max = 255)
    @Column(name = "user_activation_key")
    private String activationKey;

    @NotNull
    @Column(name = "user_status")
    private Integer status;

    @NotNull
    @Size(max = 255)
    @Basic(optional = false) // = @Column(name = "display_name", nullable = false)
    private String displayName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNicename() {
        return nicename;
    }

    public void setNicename(String nicename) {
        this.nicename = nicename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getRegistered() {
        return registered;
    }

    public void setRegistered(Timestamp registered) {
        this.registered = registered;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
