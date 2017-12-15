package pappl.entitiesmongo.DAO;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public abstract class DAOMongo {
    private static final String MONGO_URL = "mongodb://localhost:27017";
    private static final String DB_NAME = "testPat";
    private static final String COLLECTION_NAME = "MyCol";
    private MongoClient mongoClient;
    private MongoClientURI mongoAdress;
    private MongoDatabase mongoDb;
    private MongoCollection<Document> mongoCollection;

    public DAOMongo() {
        this.mongoAdress = new MongoClientURI(MONGO_URL);
        this.mongoClient = new MongoClient(this.mongoAdress);
        this.mongoDb = this.mongoClient.getDatabase(DB_NAME);
        this.mongoCollection = this.mongoDb.getCollection(COLLECTION_NAME);
    }

    public static String getDbName() {
        return DB_NAME;
    }

    public static String getCollectionName() {
        return COLLECTION_NAME;
    }

    public static String getMongoUrl() {
        return MONGO_URL;
    }

    public MongoCollection<Document> getMongoCollection() {
        return mongoCollection;
    }

    public void setMongoCollection(MongoCollection<Document> mongoCollection) {
        this.mongoCollection = mongoCollection;
    }

    public MongoDatabase getMongoDb() {
        return mongoDb;
    }

    public void setMongoDb(MongoDatabase mongoDb) {
        this.mongoDb = mongoDb;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoClientURI getMongoAdress() {
        return mongoAdress;
    }

    public void setMongoAdress(MongoClientURI mongoAdress) {
        this.mongoAdress = mongoAdress;
    }
}
