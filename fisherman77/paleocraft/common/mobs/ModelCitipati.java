// Date: 12/30/2012 2:50:01 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fisherman77.paleocraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCitipati extends ModelBase
{
  //fields
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer Neck1;
    ModelRenderer Neck2;
    ModelRenderer Tail4;
    ModelRenderer TailFan;
    ModelRenderer Tail5;
    ModelRenderer Tail1;
    ModelRenderer Tail3;
    ModelRenderer Tail2;
    ModelRenderer Body;
    ModelRenderer Wattle2;
    ModelRenderer Wattle1;
    ModelRenderer Head;
    ModelRenderer Beak;
    ModelRenderer Crest;
    ModelRenderer Right_Thigh;
    ModelRenderer Right_Leg;
    ModelRenderer Right_Foot;
    ModelRenderer Left_Thigh;
    ModelRenderer Left_Leg;
    ModelRenderer Left_Foot;
  
  public ModelCitipati()
  {
    textureWidth = 100;
    textureHeight = 100;
    
      LeftArm = new ModelRenderer(this, 0, -11);
      LeftArm.addBox(0F, 0F, -7F, 0, 13, 11);
      LeftArm.setRotationPoint(3F, 12F, -4F);
      LeftArm.setTextureSize(100, 100);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0.6806784F, 0.3665191F, -0.5410521F);
      RightArm = new ModelRenderer(this, 0, -11);
      RightArm.addBox(0F, 0F, -7F, 0, 13, 11);
      RightArm.setRotationPoint(-3F, 12F, -4F);
      RightArm.setTextureSize(100, 100);
      RightArm.mirror = true;
      setRotation(RightArm, 0.6806784F, -0.3665191F, 0.5410521F);
      Neck1 = new ModelRenderer(this, 72, 41);
      Neck1.addBox(-2F, -2F, -4F, 4, 4, 3);
      Neck1.setRotationPoint(0F, 10F, -2.5F);
      Neck1.setTextureSize(100, 100);
      Neck1.mirror = true;
      setRotation(Neck1, -0.6283185F, 0F, 0F);
      Neck2 = new ModelRenderer(this, 15, 52);
      Neck2.addBox(-1F, -2F, -7F, 2, 3, 10);
      Neck2.setRotationPoint(0F, 6F, -7F);
      Neck2.setTextureSize(100, 100);
      Neck2.mirror = true;
      setRotation(Neck2, -0.9948377F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 73, 53);
      Tail4.addBox(-1F, -1F, 0F, 2, 3, 8);
      Tail4.setRotationPoint(0F, 7F, 19F);
      Tail4.setTextureSize(100, 100);
      Tail4.mirror = true;
      setRotation(Tail4, 0F, 0F, 0F);
      TailFan = new ModelRenderer(this, 62, 4);
      TailFan.addBox(-5F, 0F, 0F, 10, 30, 0);
      TailFan.setRotationPoint(0F, 7F, 12F);
      TailFan.setTextureSize(100, 100);
      TailFan.mirror = true;
      setRotation(TailFan, 1.58825F, 0F, 0F);
      Tail5 = new ModelRenderer(this, 63, 85);
      Tail5.addBox(-1F, 0F, 0F, 2, 2, 9);
      Tail5.setRotationPoint(0F, 6F, 27F);
      Tail5.setTextureSize(100, 100);
      Tail5.mirror = true;
      setRotation(Tail5, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 17, 69);
      Tail1.addBox(-3F, -2F, 0F, 5, 6, 4);
      Tail1.setRotationPoint(0.5F, 8F, 4.5F);
      Tail1.setTextureSize(100, 100);
      Tail1.mirror = true;
      setRotation(Tail1, 0.0872665F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 12, 82);
      Tail3.addBox(-1F, -1F, 0F, 2, 4, 8);
      Tail3.setRotationPoint(0F, 7F, 11F);
      Tail3.setTextureSize(100, 100);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 37, 82);
      Tail2.addBox(-2F, -2F, 0F, 4, 5, 5);
      Tail2.setRotationPoint(0F, 8F, 7F);
      Tail2.setTextureSize(100, 100);
      Tail2.mirror = true;
      setRotation(Tail2, 0.0872665F, 0F, 0F);
      Body = new ModelRenderer(this, 46, 59);
      Body.addBox(-3F, -3F, 0F, 6, 7, 11);
      Body.setRotationPoint(0F, 9F, -5F);
      Body.setTextureSize(100, 100);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Wattle2 = new ModelRenderer(this, 32, 34);
      Wattle2.addBox(-0.5F, 0F, -1F, 1, 5, 1);
      Wattle2.setRotationPoint(0F, 6F, -7F);
      Wattle2.setTextureSize(100, 100);
      Wattle2.mirror = true;
      setRotation(Wattle2, 0F, 0F, 0F);
      Wattle1 = new ModelRenderer(this, 21, 33);
      Wattle1.addBox(-0.5F, 0F, -1F, 1, 5, 2);
      Wattle1.setRotationPoint(0F, 4F, -10F);
      Wattle1.setTextureSize(100, 100);
      Wattle1.mirror = true;
      setRotation(Wattle1, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 27, 6);
      Head.addBox(-1.5F, -2F, -4F, 3, 5, 6);
      Head.setRotationPoint(0F, 1F, -11F);
      Head.setTextureSize(100, 100);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Beak = new ModelRenderer(this, 17, 21);
      Beak.addBox(-1.5F, -1F, -5F, 3, 4, 1);
      Beak.setRotationPoint(0F, 1F, -11F);
      Beak.setTextureSize(100, 100);
      Beak.mirror = true;
      setRotation(Beak, 0F, 0F, 0F);
      Crest = new ModelRenderer(this, 39, 18);
      Crest.addBox(0F, -5F, -5F, 0, 4, 7);
      Crest.setRotationPoint(0F, 1F, -11F);
      Crest.setTextureSize(100, 100);
      Crest.mirror = true;
      setRotation(Crest, 0F, 0F, 0F);
      //Right_Thigh.mirror = true;
      Right_Thigh = new ModelRenderer(this, 10, 42);
      Right_Thigh.addBox(-2F, -3F, -1F, 2, 9, 4);
      Right_Thigh.setRotationPoint(-2F, 11F, 3F);
      Right_Thigh.setTextureSize(100, 100);
      Right_Thigh.mirror = true;
      setRotation(Right_Thigh, 0F, 0F, -0.0174533F);
      //Right_Thigh.mirror = false;
      //Right_Leg.mirror = true;
      Right_Leg = new ModelRenderer(this, 42, 41);
      Right_Leg.addBox(-2F, 5F, 2F, 2, 7, 2);
      Right_Leg.setRotationPoint(-2F, 11F, 3F);
      Right_Leg.setTextureSize(100, 100);
      Right_Leg.mirror = true;
      setRotation(Right_Leg, 0F, 0F, -0.0174533F);
      //Right_Leg.mirror = false;
      //Right_Foot.mirror = true;
      Right_Foot = new ModelRenderer(this, 51, 41);
      Right_Foot.addBox(-2F, 12F, 0F, 2, 1, 4);
      Right_Foot.setRotationPoint(-2F, 11F, 3F);
      Right_Foot.setTextureSize(100, 100);
      Right_Foot.mirror = true;
      setRotation(Right_Foot, 0F, 0F, -0.0174533F);
      //Right_Foot.mirror = false;
      Left_Thigh = new ModelRenderer(this, 10, 42);
      Left_Thigh.addBox(0F, -3F, -1F, 2, 9, 4);
      Left_Thigh.setRotationPoint(2F, 11F, 3F);
      Left_Thigh.setTextureSize(100, 100);
      Left_Thigh.mirror = true;
      setRotation(Left_Thigh, 0F, 0F, 0F);
      Left_Leg = new ModelRenderer(this, 42, 41);
      Left_Leg.addBox(0F, 5F, 2F, 2, 7, 2);
      Left_Leg.setRotationPoint(2F, 11F, 3F);
      Left_Leg.setTextureSize(100, 100);
      Left_Leg.mirror = true;
      setRotation(Left_Leg, 0F, 0F, 0F);
      Left_Foot = new ModelRenderer(this, 51, 41);
      Left_Foot.addBox(0F, 12F, 0F, 2, 1, 4);
      Left_Foot.setRotationPoint(2F, 11F, 3F);
      Left_Foot.setTextureSize(100, 100);
      Left_Foot.mirror = true;
      setRotation(Left_Foot, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    LeftArm.render(f5);
    RightArm.render(f5);
    Neck1.render(f5);
    Neck2.render(f5);
    Tail4.render(f5);
    TailFan.render(f5);
    Tail5.render(f5);
    Tail1.render(f5);
    Tail3.render(f5);
    Tail2.render(f5);
    Body.render(f5);
    Wattle2.render(f5);
    Wattle1.render(f5);
    Head.render(f5);
    Beak.render(f5);
    Crest.render(f5);
    Right_Thigh.render(f5);
    Right_Leg.render(f5);
    Right_Foot.render(f5);
    Left_Thigh.render(f5);
    Left_Leg.render(f5);
    Left_Foot.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
