package workbench;

import java.util.List;

import javax.swing.ImageIcon;

public class Item
{
    private String name;
    private List<Integer> id;
    private ImageIcon image;

    public Item(String name, List<Integer> id, ImageIcon image)
    {
        this.name = name;
        this.id = id;
        this.image = image;
    }

    public String getName()
    {
        return name;
    }

    public List<Integer> getId()
    {
        return id;
    }

    public ImageIcon getImage()
    {
        return image;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(List<Integer> id)
    {
        this.id = id;
    }

    public void setImage(ImageIcon image)
    {
        this.image = image;
    }
}