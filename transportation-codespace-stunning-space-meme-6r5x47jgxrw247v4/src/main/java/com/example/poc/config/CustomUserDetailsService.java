package com.example.poc.config;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.example.poc.domain.User;
import com.example.poc.config.CustomUserDetails;
import com.example.poc.repository.UserRepository;


@Service
public class CustomUserDetailsService implements UserDetailsService{
    private final  UserRepository userRepository;


   public CustomUserDetailsService(UserRepository userRepository){
          this.userRepository= userRepository;
   }


   @Override
   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUserName(username).orElseThrow(()-> new UsernameNotFoundException("user not found"));
    return new CustomUserDetails(user);
   }

   
}
