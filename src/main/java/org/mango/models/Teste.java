package org.mango.models;

import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "ThePerson")
public class Teste {
  private String name;
  private String lasteName;

  public Teste(String name, String lasteName) {
    this.name = name;
    this.lasteName = lasteName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLasteName() {
    return lasteName;
  }

  public void setLasteName(String lasteName) {
    this.lasteName = lasteName;
  }

}
