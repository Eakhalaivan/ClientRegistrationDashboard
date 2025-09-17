//package com.example.MoneyTransfer.System.Project;
//
//import java.util.Collection;
//import java.util.Collections;
//
//public class UserPrincipal implements UserDetails {
//
//
//
//        private final Student student;
//
//        public UserPrincipal(Student student) {
//            this.student = student;
//        }
//
//        @Override
//        public Collection<? extends GrantedAuthority> getAuthorities() {
//            return Collections.singleton(new SimpleGrantedAuthority("ROLE_"+ student.getRole()));
//        }
//
//        @Override
//        public String getPassword() {
//            return student.getPassword();  // use Student entity
//        }
//
//        @Override
//        public String getUsername() {
//            return student.getUserName(); // use Student entity
//        }
//
//        @Override
//        public boolean isAccountNonExpired() { return true; }
//
//        @Override
//        public boolean isAccountNonLocked() { return true; }
//
//        @Override
//        public boolean isCredentialsNonExpired() { return true; }
//
//        @Override
//        public boolean isEnabled() { return true; }
//    }
//
//}
