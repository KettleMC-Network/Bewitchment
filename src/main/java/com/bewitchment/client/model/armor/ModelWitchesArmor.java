package com.bewitchment.client.model.armor;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;

import java.util.HashMap;
import java.util.Map;

/**
 * witches_attire_4 - Ingoleth, cybercat5555
 * Created using Tabula 5.1.0
 */
@SuppressWarnings({"WeakerAccess", "NullableProblems"})
public class ModelWitchesArmor extends ModelArmor {

	public static final ModelWitchesArmor HAT = new ModelWitchesArmor(EntityEquipmentSlot.HEAD, true);
	public static final ModelWitchesArmor COWL = new ModelWitchesArmor(EntityEquipmentSlot.HEAD, false);
	public static Map<EntityEquipmentSlot, ModelWitchesArmor> INSTANCES = new HashMap<>();
	public final ModelRenderer sleeveRight;
	public final ModelRenderer shoulderRight;
	public final ModelRenderer sleeveDroopRight;
	public final ModelRenderer tunicRightFront;
	public final ModelRenderer tunicRightMiddle;
	public final ModelRenderer tunicRightBack;
	public final ModelRenderer tunicDroopRightFront;
	public final ModelRenderer tunicDroopRightMiddle;
	public final ModelRenderer tunicDroopRightBack;
	public final ModelRenderer hat1;
	public final ModelRenderer hood01;
	public final ModelRenderer hat2;
	public final ModelRenderer hatWing;
	public final ModelRenderer hat3;
	public final ModelRenderer hoodFringe01;
	public final ModelRenderer hoodFringeL01;
	public final ModelRenderer hoodFringeR01;
	public final ModelRenderer hoodFringeL02;
	public final ModelRenderer hoodFringeR02;
	public final ModelRenderer hoodFringeL03;
	public final ModelRenderer hoodFringeR03;
	public final ModelRenderer hoodShade;
	public final ModelRenderer hoodFringeL04;
	public final ModelRenderer hoodFringeR04;
	public final ModelRenderer hoodPipe01;
	public final ModelRenderer hoodPipe02;
	public final ModelRenderer robeBody;
	public final ModelRenderer sleeveLeft;
	public final ModelRenderer shoulderLeft;
	public final ModelRenderer sleeveLeft_1;
	public final ModelRenderer tunicLeftFront;
	public final ModelRenderer tunicLeftMiddle;
	public final ModelRenderer tunicLeftBack;
	public final ModelRenderer tunicDroopLeftFront;
	public final ModelRenderer tunicDroopLeftMiddle;
	public final ModelRenderer tunicDroopLeftBack;
	private final boolean hat;

	public ModelWitchesArmor(EntityEquipmentSlot slot, boolean hat) {
		super(slot);
		this.hat = hat;
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.sleeveLeft = new ModelRenderer(this, 47, 81);
		this.sleeveLeft.mirror = true;
		this.sleeveLeft.setRotationPoint(0, -0.1F, 0);
		this.sleeveLeft.addBox(-1.5F, -2.1F, -2.5F, 5, 13, 5, 0);
		this.tunicRightMiddle = new ModelRenderer(this, 23, 65);
		this.tunicRightMiddle.setRotationPoint(-2.51F, -0.1F, -2.1F);
		this.tunicRightMiddle.addBox(-0.5F, 0, -2, 5, 10, 2, 0);
		this.setRotateAngle(tunicRightMiddle, 0.10471975511965977F, -1.5707963267948966F, 0);
		this.hat1 = new ModelRenderer(this, 49, 111);
		this.hat1.setRotationPoint(0, 0, 0);
		this.hat1.addBox(-4.5F, -10.5F, -4.5F, 9, 5, 9, 0);
		this.hood01 = new ModelRenderer(this, 70, 0);
		this.hood01.setRotationPoint(0, 0, 0);
		this.hood01.addBox(-4.5F, -9, -4.7F, 9, 9, 10, 0);
		this.hatWing = new ModelRenderer(this, 0, 112);
		this.hatWing.setRotationPoint(0, -6, 0);
		this.hatWing.addBox(-6, 0, -6, 12, 1, 12, 0);
		this.setRotateAngle(hatWing, 0.03490658503988659F, 0, 0.06981317007977318F);
		this.bipedLeftLeg = new ModelRenderer(this, 16, 48);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12, 0.1F);
		this.bipedLeftLeg.addBox(-2, 0, -2, 4, 12, 4, 0);
		this.hoodPipe02 = new ModelRenderer(this, 65, 54);
		this.hoodPipe02.setRotationPoint(0, -0.3F, 3.1F);
		this.hoodPipe02.addBox(-2, -2, 0, 4, 4, 4, 0);
		this.setRotateAngle(hoodPipe02, -0.45378560551852565F, 0, 0);
		this.hoodFringeL01 = new ModelRenderer(this, 77, 24);
		this.hoodFringeL01.setRotationPoint(1.9F, -8.2F, 0.1F);
		this.hoodFringeL01.addBox(0, -0.3F, -5.39F, 2, 8, 10, 0);
		this.setRotateAngle(hoodFringeL01, 0, 0, -0.2792526803190927F);
		this.hoodFringeR04 = new ModelRenderer(this, 57, 20);
		this.hoodFringeR04.mirror = true;
		this.hoodFringeR04.setRotationPoint(-2.7F, -8.4F, 0.1F);
		this.hoodFringeR04.addBox(-0.9F, -1, -5.38F, 4, 2, 11, 0);
		this.setRotateAngle(hoodFringeR04, 0, 0, -0.3141592653589793F);
		this.tunicDroopLeftFront = new ModelRenderer(this, 53, 77);
		this.tunicDroopLeftFront.setRotationPoint(-0.01F, 10, 1);
		this.tunicDroopLeftFront.addBox(0, 0, -1, 4, 2, 1, 0);
		this.setRotateAngle(tunicDroopLeftFront, -0.2617993877991494F, 0, 0);
		this.tunicDroopRightBack = new ModelRenderer(this, 53, 77);
		this.tunicDroopRightBack.setRotationPoint(-0.01F, 10, 1);
		this.tunicDroopRightBack.addBox(0, 0, -1, 4, 2, 1, 0);
		this.setRotateAngle(tunicDroopRightBack, -0.2617993877991494F, 0, 0);
		this.sleeveDroopRight = new ModelRenderer(this, 49, 100);
		this.sleeveDroopRight.setRotationPoint(1.01F, 10.65F, 2.2F);
		this.sleeveDroopRight.addBox(-4.5F, -4, 0, 5, 4, 2, 0);
		this.setRotateAngle(sleeveDroopRight, 0.5235987755982988F, 0, 0);
		this.hoodFringe01 = new ModelRenderer(this, 66, 0);
		this.hoodFringe01.setRotationPoint(0, 0, 0.1F);
		this.hoodFringe01.addBox(-3, -8.9F, -5.4F, 6, 2, 1, 0);
		this.tunicLeftMiddle = new ModelRenderer(this, 23, 65);
		this.tunicLeftMiddle.setRotationPoint(2.51F, 0.1F, -2.1F);
		this.tunicLeftMiddle.addBox(-0.5F, 0, 0, 5, 10, 2, 0);
		this.setRotateAngle(tunicLeftMiddle, -0.10471975511965977F, -1.5707963267948966F, 0);
		this.hoodShade = new ModelRenderer(this, 105, 0);
		this.hoodShade.setRotationPoint(0, -7.3F, -5.2F);
		this.hoodShade.addBox(-4, 0, 0, 8, 8, 0, 0);
		this.setRotateAngle(hoodShade, 0.05235987755982988F, 0, 0);
		this.hoodFringeL04 = new ModelRenderer(this, 57, 20);
		this.hoodFringeL04.setRotationPoint(2.7F, -8.4F, 0.1F);
		this.hoodFringeL04.addBox(-3.2F, -1, -5.38F, 4, 2, 11, 0);
		this.setRotateAngle(hoodFringeL04, 0, 0, 0.3141592653589793F);
		this.tunicLeftBack = new ModelRenderer(this, 53, 65);
		this.tunicLeftBack.setRotationPoint(-1.99F, 0, 2.4F);
		this.tunicLeftBack.addBox(0, 0, -1, 4, 10, 1, 0);
		this.setRotateAngle(tunicLeftBack, 0.06981317007977318F, 0, 0);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12, 0.1F);
		this.bipedRightLeg.addBox(-2, 0, -2, 4, 12, 4, 0);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0, 0, 0);
		this.bipedHead.addBox(-4, -8, -4, 8, 8, 8, 0);
		this.bipedBody = new ModelRenderer(this, 16, 16);
		this.bipedBody.setRotationPoint(0, 0, 0);
		this.bipedBody.addBox(-4, 0, -2, 8, 12, 4, 0);
		this.hat2 = new ModelRenderer(this, 87, 114);
		this.hat2.setRotationPoint(0, -10.5F, -3);
		this.hat2.addBox(-3, -4, 0, 6, 4, 6, 0);
		this.setRotateAngle(hat2, -0.2617993877991494F, 0, 0);
		this.tunicRightFront = new ModelRenderer(this, 53, 65);
		this.tunicRightFront.setRotationPoint(2.01F, 0, -2.6F);
		this.tunicRightFront.addBox(0, 0, -1, 4, 10, 1, 0);
		this.setRotateAngle(tunicRightFront, -3.07177948351002F, 0, 3.141592653589793F);
		this.tunicDroopRightFront = new ModelRenderer(this, 53, 77);
		this.tunicDroopRightFront.setRotationPoint(-0.01F, 10, -1);
		this.tunicDroopRightFront.addBox(0, 0, 0, 4, 2, 1, 0);
		this.setRotateAngle(tunicDroopRightFront, 0.2617993877991494F, 0, 0);
		this.hoodFringeR03 = new ModelRenderer(this, 97, 33);
		this.hoodFringeR03.mirror = true;
		this.hoodFringeR03.setRotationPoint(-5.15F, -0.7F, 0.1F);
		this.hoodFringeR03.addBox(0, -0.9F, -5.37F, 5, 2, 10, 0);
		this.setRotateAngle(hoodFringeR03, 0, 0, 0.3141592653589793F);
		this.hoodFringeR02 = new ModelRenderer(this, 97, 19);
		this.hoodFringeR02.mirror = true;
		this.hoodFringeR02.setRotationPoint(-4.85F, -1.2F, 0.1F);
		this.hoodFringeR02.addBox(-1, -0.5F, -5.38F, 1, 2, 10, 0);
		this.setRotateAngle(hoodFringeR02, 0, 0, -0.20943951023931953F);
		this.tunicLeftFront = new ModelRenderer(this, 53, 65);
		this.tunicLeftFront.setRotationPoint(-1.99F, 0, -2.5F);
		this.tunicLeftFront.addBox(0, 0, 0, 4, 10, 1, 0);
		this.setRotateAngle(tunicLeftFront, -0.06981317007977318F, 0, 0);
		this.hoodPipe01 = new ModelRenderer(this, 65, 43);
		this.hoodPipe01.setRotationPoint(0, -7, 4.2F);
		this.hoodPipe01.addBox(-3, -2.5F, 0, 6, 6, 4, 0);
		this.setRotateAngle(hoodPipe01, -0.40142572795869574F, 0, 0);
		this.hoodFringeL03 = new ModelRenderer(this, 97, 33);
		this.hoodFringeL03.setRotationPoint(5.15F, -0.7F, 0.1F);
		this.hoodFringeL03.addBox(-5, -0.9F, -5.37F, 5, 2, 10, 0);
		this.setRotateAngle(hoodFringeL03, 0, 0, -0.3141592653589793F);
		this.sleeveRight = new ModelRenderer(this, 47, 81);
		this.sleeveRight.setRotationPoint(0, -0.1F, 0);
		this.sleeveRight.addBox(-3.5F, -2.4F, -2.5F, 5, 13, 5, 0);
		this.shoulderRight = new ModelRenderer(this, 0, 68);
		this.shoulderRight.setRotationPoint(0, 0, 0);
		this.shoulderRight.addBox(-1.2F, -2.9F, -3, 5, 5, 6, 0);
		this.setRotateAngle(shoulderRight, 0, 3.141592653589793F, -0.08726646259971647F);
		this.bipedLeftArm = new ModelRenderer(this, 32, 48);
		this.bipedLeftArm.setRotationPoint(5, 2, -0);
		this.bipedLeftArm.addBox(-1, -2, -2, 4, 12, 4, 0);
		this.setRotateAngle(bipedLeftArm, 0, 0, -0.10000736613927509F);
		this.hoodFringeL02 = new ModelRenderer(this, 97, 19);
		this.hoodFringeL02.setRotationPoint(4.85F, -1.2F, 0.1F);
		this.hoodFringeL02.addBox(0, -0.5F, -5.38F, 1, 2, 10, 0);
		this.setRotateAngle(hoodFringeL02, 0, 0, 0.20943951023931953F);
		this.tunicDroopLeftMiddle = new ModelRenderer(this, 23, 77);
		this.tunicDroopLeftMiddle.setRotationPoint(-0.01F, 9.9F, 1);
		this.tunicDroopLeftMiddle.addBox(-0.5F, 0, -1, 5, 2, 2, 0);
		this.setRotateAngle(tunicDroopLeftMiddle, -0.2617993877991494F, 0, 0);
		this.bipedRightArm = new ModelRenderer(this, 40, 16);
		this.bipedRightArm.setRotationPoint(-5, 2, 0);
		this.bipedRightArm.addBox(-3, -2, -2, 4, 12, 4, 0);
		this.setRotateAngle(bipedRightArm, 0, 0, 0.10000736613927509F);
		this.hat3 = new ModelRenderer(this, 110, 112);
		this.hat3.setRotationPoint(1.4F, -4, 1.5F);
		this.hat3.addBox(-3, -4, 0, 3, 4, 3, 0);
		this.setRotateAngle(hat3, -0.3490658503988659F, 0, 0);
		this.tunicDroopRightMiddle = new ModelRenderer(this, 23, 77);
		this.tunicDroopRightMiddle.setRotationPoint(-0.01F, 9.9F, -1);
		this.tunicDroopRightMiddle.addBox(-0.5F, 0, -1, 5, 2, 2, 0);
		this.setRotateAngle(tunicDroopRightMiddle, 0.2617993877991494F, 0, 0);
		this.robeBody = new ModelRenderer(this, 3, 81);
		this.robeBody.setRotationPoint(0, 0, 0);
		this.robeBody.addBox(-4.5F, -0.01F, -2.5F, 9, 12, 5, 0);
		this.tunicDroopLeftBack = new ModelRenderer(this, 53, 77);
		this.tunicDroopLeftBack.setRotationPoint(-0.01F, 10, -1);
		this.tunicDroopLeftBack.addBox(0, 0, 0, 4, 2, 1, 0);
		this.setRotateAngle(tunicDroopLeftBack, 0.2617993877991494F, 0, 0);
		this.shoulderLeft = new ModelRenderer(this, 0, 68);
		this.shoulderLeft.setRotationPoint(0, 0, 0);
		this.shoulderLeft.addBox(-1.2F, -2.5F, -3, 5, 5, 6, 0);
		this.setRotateAngle(shoulderLeft, 0, 0, 0.08726646259971647F);
		this.hoodFringeR01 = new ModelRenderer(this, 77, 24);
		this.hoodFringeR01.mirror = true;
		this.hoodFringeR01.setRotationPoint(-1.9F, -8.2F, 0.1F);
		this.hoodFringeR01.addBox(-2, -0.3F, -5.39F, 2, 8, 10, 0);
		this.setRotateAngle(hoodFringeR01, 0, 0, 0.2792526803190927F);
		this.sleeveLeft_1 = new ModelRenderer(this, 49, 100);
		this.sleeveLeft_1.setRotationPoint(0.99F, 10.95F, 2.2F);
		this.sleeveLeft_1.addBox(-2.5F, -4, 0, 5, 4, 2, 0);
		this.setRotateAngle(sleeveLeft_1, 0.5235987755982988F, 0, 0);
		this.tunicRightBack = new ModelRenderer(this, 53, 65);
		this.tunicRightBack.setRotationPoint(2.01F, 0, 2.4F);
		this.tunicRightBack.addBox(0, 0, 0, 4, 10, 1, 0);
		this.setRotateAngle(tunicRightBack, 3.07177948351002F, 0, 3.141592653589793F);
		this.bipedLeftArm.addChild(this.sleeveLeft);
		this.bipedRightLeg.addChild(this.tunicRightMiddle);
		this.bipedHead.addChild(this.hat1);
		this.bipedHead.addChild(this.hood01);
		this.hat1.addChild(this.hatWing);
		this.hoodPipe01.addChild(this.hoodPipe02);
		this.hood01.addChild(this.hoodFringeL01);
		this.hood01.addChild(this.hoodFringeR04);
		this.tunicLeftFront.addChild(this.tunicDroopLeftFront);
		this.tunicRightBack.addChild(this.tunicDroopRightBack);
		this.sleeveRight.addChild(this.sleeveDroopRight);
		this.hood01.addChild(this.hoodFringe01);
		this.bipedLeftLeg.addChild(this.tunicLeftMiddle);
		this.hood01.addChild(this.hoodShade);
		this.hood01.addChild(this.hoodFringeL04);
		this.bipedLeftLeg.addChild(this.tunicLeftBack);
		this.hat1.addChild(this.hat2);
		this.bipedRightLeg.addChild(this.tunicRightFront);
		this.tunicRightFront.addChild(this.tunicDroopRightFront);
		this.hood01.addChild(this.hoodFringeR03);
		this.hood01.addChild(this.hoodFringeR02);
		this.bipedLeftLeg.addChild(this.tunicLeftFront);
		this.hood01.addChild(this.hoodPipe01);
		this.hood01.addChild(this.hoodFringeL03);
		this.bipedRightArm.addChild(this.sleeveRight);
		this.sleeveRight.addChild(this.shoulderRight);
		this.hood01.addChild(this.hoodFringeL02);
		this.tunicLeftMiddle.addChild(this.tunicDroopLeftMiddle);
		this.hat2.addChild(this.hat3);
		this.tunicRightMiddle.addChild(this.tunicDroopRightMiddle);
		this.bipedBody.addChild(this.robeBody);
		this.tunicLeftBack.addChild(this.tunicDroopLeftBack);
		this.sleeveLeft.addChild(this.shoulderLeft);
		this.hood01.addChild(this.hoodFringeR01);
		this.sleeveLeft.addChild(this.sleeveLeft_1);
		this.bipedRightLeg.addChild(this.tunicRightBack);
	}

	public static ModelWitchesArmor getInstance(EntityEquipmentSlot slot, boolean hat) {
		if (slot.getSlotType() != EntityEquipmentSlot.Type.ARMOR) {
			return null;
		}
		if (slot == EntityEquipmentSlot.HEAD) {
			return hat ? HAT : COWL;
		}
		return INSTANCES.computeIfAbsent(slot, k -> new ModelWitchesArmor(slot, hat));
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);

		if (hat) hat1.showModel = slot == EntityEquipmentSlot.HEAD;
		else hood01.showModel = slot == EntityEquipmentSlot.HEAD;
		bipedBody.showModel = slot == EntityEquipmentSlot.CHEST;
		bipedRightArm.showModel = slot == EntityEquipmentSlot.CHEST;
		bipedLeftArm.showModel = slot == EntityEquipmentSlot.CHEST;
		bipedRightLeg.showModel = slot == EntityEquipmentSlot.LEGS;
		bipedLeftLeg.showModel = slot == EntityEquipmentSlot.LEGS;
		super.bipedHeadwear.showModel = false;
		super.bipedHeadwear.isHidden = true;

		super.bipedHead = hat ? hat1 : hood01;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
	}
}