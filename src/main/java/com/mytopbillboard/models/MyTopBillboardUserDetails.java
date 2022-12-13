package com.mytopbillboard.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class MyTopBillboardUserDetails extends User implements UserDetails {



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public MyTopBillboardUserDetails(){

    }

    public MyTopBillboardUserDetails(long id, String username, String email, String password) {
        super(id, username, email, password);
    }


}//End of MyTopBillboardUserDetials Class
