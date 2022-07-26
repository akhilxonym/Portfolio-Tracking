package com.assignment.smallcase.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.DocumentName;

import com.assignment.smallcase.utility.ObjectUtility;
import com.mongodb.DBObject;

import org.bson.Document;
import org.springframework.stereotype.Component;



@Component
public class MongoMapper {
    protected <T> T getMappedObject(DBObject document,Class<T> clas){
        return ObjectUtility.getMappedObject(document.toMap(), clas);
    }

    protected <T> T getMappedObject(Document document, Class<T> castTo){
        return ObjectUtility.getMappedObject(document, castTo);
    }

    protected Document getDocument(DBObject doc){
        if(doc==null)
            return null;
        return new Document(doc.toMap());
    }

    protected List<Document> getDocuments(List<DBObject> objects){
        return objects.stream().map(object-> getDocument(object)).collect(Collectors.toList());
    }
}