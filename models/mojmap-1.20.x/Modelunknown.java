// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelunknown<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "unknown"), "main");
	private final ModelPart Shark;
	private final ModelPart Torso;
	private final ModelPart Torso2;
	private final ModelPart Torso3;
	private final ModelPart Thorax;
	private final ModelPart Abdomen;
	private final ModelPart Tail;
	private final ModelPart Dorsal2;
	private final ModelPart under;
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart Dorsal;
	private final ModelPart RightFin;
	private final ModelPart LeftFin;
	private final ModelPart Head;
	private final ModelPart skull;
	private final ModelPart Teef;
	private final ModelPart L;
	private final ModelPart R;
	private final ModelPart jaw;

	public Modelunknown(ModelPart root) {
		this.Shark = root.getChild("Shark");
		this.Torso = this.Shark.getChild("Torso");
		this.Torso2 = this.Torso.getChild("Torso2");
		this.Torso3 = this.Torso2.getChild("Torso3");
		this.Thorax = this.Torso2.getChild("Thorax");
		this.Abdomen = this.Thorax.getChild("Abdomen");
		this.Tail = this.Abdomen.getChild("Tail");
		this.Dorsal2 = this.Thorax.getChild("Dorsal2");
		this.under = this.Thorax.getChild("under");
		this.bone2 = this.Thorax.getChild("bone2");
		this.bone = this.Thorax.getChild("bone");
		this.Dorsal = this.Torso2.getChild("Dorsal");
		this.RightFin = this.Torso2.getChild("RightFin");
		this.LeftFin = this.Torso2.getChild("LeftFin");
		this.Head = this.Shark.getChild("Head");
		this.skull = this.Head.getChild("skull");
		this.Teef = this.skull.getChild("Teef");
		this.L = this.skull.getChild("L");
		this.R = this.skull.getChild("R");
		this.jaw = this.Head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Shark = partdefinition.addOrReplaceChild("Shark", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -15.0F, 0.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition Torso = Shark.addOrReplaceChild("Torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 9.0F));

		PartDefinition Torso2 = Torso.addOrReplaceChild("Torso2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Torso3 = Torso2.addOrReplaceChild("Torso3", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F,
				-5.0F, 0.0F, 9.0F, 9.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Thorax = Torso2.addOrReplaceChild("Thorax", CubeListBuilder.create().texOffs(0, 29).addBox(-3.5F,
				-3.25F, -1.0F, 7.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 20.0F));

		PartDefinition Abdomen = Thorax.addOrReplaceChild("Abdomen", CubeListBuilder.create().texOffs(0, 46).addBox(
				-2.0F, -1.9F, -1.0F, 4.0F, 3.9F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition Tail = Abdomen.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tail_r1 = Tail.addOrReplaceChild("Tail_r1",
				CubeListBuilder.create().texOffs(58, 6)
						.addBox(-0.5F, 13.69F, -1.4F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(26, 62)
						.addBox(-0.5F, 3.69F, -1.4F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0631F, 7.4455F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Dorsal2 = Thorax.addOrReplaceChild("Dorsal2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -4.0F, 10.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Dorsal2_r1 = Dorsal2.addOrReplaceChild("Dorsal2_r1",
				CubeListBuilder.create().texOffs(64, 45).addBox(-0.5F, 18.0F, -6.0F, 1.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 20.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition under = Thorax.addOrReplaceChild("under", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, 11.0F));

		PartDefinition under_r1 = under.addOrReplaceChild("under_r1",
				CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, 22.0F, -3.0F, 1.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.0F, 19.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone2 = Thorax.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 4.0F, 5.0F));

		PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1",
				CubeListBuilder.create().texOffs(58, 24).addBox(-8.0F, 0.0F, 6.0F, 5.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -8.0F, -0.004F, 0.4583F, -0.745F));

		PartDefinition bone = Thorax.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(3.0F, 4.0F, 5.0F));

		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1",
				CubeListBuilder.create().texOffs(36, 62).addBox(3.0F, 0.0F, 6.0F, 5.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -8.0F, -0.004F, -0.4583F, 0.745F));

		PartDefinition Dorsal = Torso2.addOrReplaceChild("Dorsal", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -5.0F, 15.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Dorsal_r1 = Dorsal.addOrReplaceChild("Dorsal_r1",
				CubeListBuilder.create().texOffs(58, 56).addBox(-0.5F, 16.0F, -22.7F, 1.0F, 9.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, 31.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RightFin = Torso2.addOrReplaceChild("RightFin", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 3.0F, 8.0F));

		PartDefinition RightFin_r1 = RightFin.addOrReplaceChild("RightFin_r1",
				CubeListBuilder.create().texOffs(26, 56).addBox(-12.0F, 1.0F, 4.0F, 11.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, -4.0F, 0.0061F, 0.5126F, -0.3697F));

		PartDefinition LeftFin = Torso2.addOrReplaceChild("LeftFin", CubeListBuilder.create(),
				PartPose.offset(5.0F, 3.0F, 8.0F));

		PartDefinition LeftFin_r1 = LeftFin.addOrReplaceChild("LeftFin_r1",
				CubeListBuilder.create().texOffs(58, 0).addBox(1.0F, 1.0F, 4.0F, 11.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -4.0F, 0.0061F, -0.5126F, 0.3697F));

		PartDefinition Head = Shark.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 9.0F));

		PartDefinition skull = Head.addOrReplaceChild("skull", CubeListBuilder.create().texOffs(36, 29).addBox(-3.5F,
				-2.25F, -9.0F, 7.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition Teef = skull.addOrReplaceChild("Teef", CubeListBuilder.create().texOffs(0, 58).addBox(-2.46F,
				-2.0F, -9.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 3.0F));

		PartDefinition L = skull.addOrReplaceChild("L", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -9.0F));

		PartDefinition R = skull.addOrReplaceChild("R", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -9.0F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(36, 45)
						.addBox(-2.5F, -1.0F, -6.0F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(58, 17)
						.addBox(-2.5F, -2.0F, -6.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Shark.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}