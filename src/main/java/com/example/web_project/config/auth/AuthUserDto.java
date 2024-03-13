package com.example.web_project.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.web_project.model.DTO.UserDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthUserDto implements UserDetails{
    
    private UserDto userDto;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new GrantedAuthority() {

            @Override
            public String getAuthority() {
                // TODO Auto-generated method stub
                return userDto.getUserRole();
            }
            
        });
        return authorities;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return userDto.getUserPw();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return userDto.getUserId();
    }

    public String getUserId(){
        return userDto.getUserId();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }
    
    
}
