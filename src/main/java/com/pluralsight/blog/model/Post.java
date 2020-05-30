package com.pluralsight.blog.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;
  private String title;
  private String lead;
  
  @Lob
  @Column(length = 1000000)
  private String body;
  private String author;
  
  @Temporal(TemporalType.DATE)
  private Date date;

  public Post() {
    super();
  }

  public Post(Long id, String title, String lead, String body, String author, Date date) {
    this();
    this.id = id;
    this.title = title;
    this.lead = lead;
    this.body = body;
    this.author = author;
    this.date = date;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getLead() {
    return lead;
  }

  public void setLead(String lead) {
    this.lead = lead;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getDate() {
    return date;
  }

  public String getDateStr() {
    DateFormat outputFormatter = new SimpleDateFormat("MM/dd/yyyy");
    return outputFormatter.format(this.date);
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
