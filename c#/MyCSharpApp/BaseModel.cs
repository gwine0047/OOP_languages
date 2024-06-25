using System;
//Imports the System namespace, which contains fundamental classes such as String, DateTime, and Guid.

using System.Collections.Generic;
//Imports the System.Collections.Generic namespace, which contains generic collection types such as Dictionary.

/*
*   a public BaseModel class that defines all common attributes
*   and methods for othere classes.
*/
public class BaseModel
{
    // public attributes with private setter
    public string Id { get; private set; }
    public DateTime CreatedAt { get, private set; }
    public DateTime UpdatedAt { get, private set; }

    // A constructor for the Base Model class
    public BaseModel()
    {
        Id = Guid.NewGuid.ToString();
        CreatedAt = DateTime.Now;
        UpdatedAt = CreatedAt;
    }

    public override string Tostring()
    {
        return $"[{GetType().Name}] ({Id}) {string.Join(", ToDictionary())}"
    }
}