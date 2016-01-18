package com.example;
import javax.servlet.http.*;
import java.io.*;
public class Dog implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable {
private String breed;
// imagine more instance variables, including some that are not Serializable
// imagine constructor and other getter/setter methods
public void valueBound(HttpSessionBindingEvent event) {
/* code to run now that I know I'm in a session */}
public void valueUnbound(HttpSessionBindingEvent event) {
/* code to run now that I know I am no longer part of a session */ }
public void sessionWillPassivate(HttpSessionEvent event) {
/* code to get my non-Serializable fi elds in a state that can survive the move to a new VM */ }
public void sessionDidActivate(HttpSessionEvent event) {
/* code to restore my fi  elds... to redo whatever I undid in sessionwillPassivate() */ }}