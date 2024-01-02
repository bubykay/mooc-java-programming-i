public class Archive {
  private String identifier;
  private String name;

  public Archive(String identifier, String name) {
    this.identifier = identifier;
    this.name = name;
  }

  public String getIdentifier() {
    return identifier;
  }

  public String getName() {
    return name;
  }

  public boolean equals(Object compared) {
    if (this == compared) {
      return true;
    }
    if (compared == null) {
      return false;
    }
    if (this.getClass() != compared.getClass()) {
      return false;
    }
    if (!(compared instanceof Archive)) {
      return false;
    }
    Archive comparedArchive = (Archive) compared;
    if (comparedArchive.getIdentifier().equals(this.getIdentifier())) {
      return true;
    }

    return false;
  }

}
